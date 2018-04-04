package ru.levelup.lesson06.jdbc;


import ru.levelup.lesson06.jdbc.configuration.Configuration;
import ru.levelup.lesson06.jdbc.configuration.PropertiesJdbcConfiguration;
import ru.levelup.lesson06.jdbc.dao.MysqlDepartmentDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


public class Connect {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        try {
            Configuration configuration = new PropertiesJdbcConfiguration().load();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}





