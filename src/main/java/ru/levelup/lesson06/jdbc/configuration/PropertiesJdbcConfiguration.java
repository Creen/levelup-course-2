package ru.levelup.lesson06.jdbc.configuration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PropertiesJdbcConfiguration implements JdbcConfiguration {

    //Указываю путь к пропиртиес и записываю в переменную. Вроде по фен шую.
    public static final String TRACK_TO_PROPERTIES = "src/main/resources/config.properties";

    @Override
    public Configuration load() throws IOException{
        Configuration configuration = new Configuration();

        BufferedReader br = new BufferedReader(new FileReader(TRACK_TO_PROPERTIES));
        String line = br.readLine();
        String [] split;
        while (line != null){
            split = line.split("=");

        }




        return null;
    }
}
