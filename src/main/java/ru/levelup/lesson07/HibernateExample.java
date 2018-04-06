package ru.levelup.lesson07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateExample {

    public static void main(String[] args) {

        //Считывает "ru.levelup.lesson07.Department" и загружает в память hibernate
        Configuration config = new Configuration();
        config.configure();

        //Управляет Connectionaly (Sessin)
        SessionFactory sessionFactory = config.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Department department = new Department("Dev", "SPb"); // transient
        session.save(department); // persistent

        transaction.commit();

        session.close();
//        department - detached


    }
}
