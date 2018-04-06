package ru.levelup.lesson10;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.levelup.lesson09.domain.Country;
import ru.levelup.lesson09.repositiry.CountryRepository;
import ru.levelup.lesson09.repositiry.CountryRepositoryImpl;

import javax.swing.table.TableRowSorter;
import java.util.List;

import static org.junit.Assert.*;

public class CountryRepositoryIT {

    private static SessionFactory factory;

    private CountryRepository countryRepository =
            new CountryRepositoryImpl(factory);

    @BeforeClass
    public static void setupFactory(){
        factory = TestHibernateUtiles.getFactory();
    }

    @Test
    public void testCreate_validParams_returnNewlyCreatedCountry(){
        String name ="England";
        String capital = "London";
        double population = 21_523_321d;

        Country country = countryRepository.create(name, capital, population);
        assertNotEquals(0, country.getId());
        System.out.println(country.getId());
    }

    @Test
    public void testGetById_entityExists_returnEntity(){

        Country country = countryRepository.create("name","capital", 523.3d);
        Country result = countryRepository.getById(country.getId());
        assertNotNull(result);
        assertEquals(country.getId(), result.getId());

    }

    @Test
    public void testGetById_entityNotExists_returnNull(){

        Country result = countryRepository.getById(1_000_000);
        assertNull(result);
    }

    @Test
    public void testGetCountriesWithMillionPopulation_countriesExists_returnList(){
        countryRepository.create("name1", "capital1", 1_123_123);
        countryRepository.create("name2", "capital2", 900_000);
        countryRepository.create("name3", "capital3", 2_000_000);
        countryRepository.create("name4", "capital4", 3_000);
        countryRepository.create("name5", "capital5", 4_000_000);

        List<Country> countries = countryRepository.getCountriesWithMillionPopulation();
        assertEquals(3, countries.size());
    }

    @Test
    public void testGetCountriesWithMillionPopulation_countriesNotExists_returnEmpty(){
        countryRepository.create("name6", "capital6", 534_343);
        countryRepository.create("name7", "capital7", 534_343);
        countryRepository.create("name8", "capital8", 534_343);

        List<Country> countries = countryRepository.getCountriesWithMillionPopulation();
        assertEquals(0, countries.size());
    }

    @After
    public void clearDatabase(){
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.createQuery("delete from Country")
                .executeUpdate();

        transaction.commit();
        session.close();
    }

    @AfterClass
    public static void closeFactory(){
        factory.close();
    }
}
