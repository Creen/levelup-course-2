package ru.levelup.lesson06.jdbc.configuration;

import java.io.*;
import java.util.Properties;

public class PropertiesJdbcConfiguration implements JdbcConfiguration {

    //Указываю путь к пропиртиес и записываю в переменную. Вроде по фен шую.
    public static final String TRACK_TO_PROPERTIES = "src/main/resources/config.properties";

    @Override
    public Configuration load() throws IOException{
        Configuration configuration = null;
        FileInputStream fileInputStream;
        Properties properties = null;

        fileInputStream = new FileInputStream(TRACK_TO_PROPERTIES);
        properties.load(fileInputStream);

        String jdbcDatabaseName = properties.setProperty("jdbc.database.name");
        String jdbcHost = properties.setProperty("jdbc.host");
        String jdbcPort = properties.setProperty("jdbc.port");
        String jdbcUsername = properties.setProperty("jdbc.username");
        String jdbcPassword = properties.setProperty("jdbc.password");

        return configuration;
    }
}
