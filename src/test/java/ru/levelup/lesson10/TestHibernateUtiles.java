package ru.levelup.lesson10;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import ru.levelup.lesson09.domain.Country;

import java.util.Properties;

public class TestHibernateUtiles {

    private static SessionFactory factory;

    static {

        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        properties.put("hibernate.connection.driver_class", "org.h2.Driver");
        //countries название базы ; - это знак вопроса
        properties.put("hibernate.connection.url", "jdbc:h2:mem:countries;INIT=create schema if not exists countries");
        properties.put("hibernate.connection.username", "sa");
        properties.put("hibernate.connection.password", "");
        properties.put("hibernate.hbm2ddl.auto", "create-drop");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(properties).build();
        factory = new Configuration()
                .addAnnotatedClass(Country.class)
                .buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getFactory(){
        return factory;
    }

}
