package ru.levelup.lesson06.jdbc;


import ru.levelup.lesson06.jdbc.configuration.Configuration;
import ru.levelup.lesson06.jdbc.configuration.PropertiesJdbcConfiguration;
import ru.levelup.lesson06.jdbc.dao.MysqlDepartmentDao;
import ru.levelup.lesson06.jdbc.domain.Department;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Collection;
import java.util.Properties;


public class Connect {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static String URL = null;
    static String USER = null;
    static String PASS = null;

    public static void main(String[] args) {

        try {
            Configuration configuration = new PropertiesJdbcConfiguration().load();
            URL = "jdbc:mysql://" + configuration.getJdbcHost() + ":" +
                    configuration.getJdbcPort() + "/" + configuration.getJdbcDatabaseName();
            USER = configuration.getJdbcUsername();
            PASS = configuration.getJdbcPassword();

            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            MysqlDepartmentDao dao = new MysqlDepartmentDao(connection);
            dao. create(1, "Russia", "Moscow");
            Collection<Department> departments = dao.findAll();

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }


    }
}





