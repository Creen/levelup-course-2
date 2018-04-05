package ru.levelup.lesson09.repositiry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.levelup.lesson09.domain.Country;

public class CountryRepositoryImpl implements CountryRepository {

    private final SessionFactory factory;

    public CountryRepositoryImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Country create(String name, String capital, double population) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Country country = new Country();
        country.setName(name);
        country.setCapital(capital);
        country.setPopulation(population);

        session.persist(country);
        transaction.commit();
        session.close();

        return country;
    }

    @Override
    public Country delete(String name) {
        return null;
    }

    @Override
    public Country update(String name, String capital, double population) {
        return null;
    }
}
