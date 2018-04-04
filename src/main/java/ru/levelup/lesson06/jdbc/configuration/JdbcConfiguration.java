package ru.levelup.lesson06.jdbc.configuration;

import java.io.IOException;

public interface JdbcConfiguration {

    Configuration load() throws IOException;
}
