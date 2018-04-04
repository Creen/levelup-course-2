package ru.levelup.lesson06.jdbc.configuration;

public class Configuration {

    private String jdbcDatabaseName;
    private String jdbcHost;
    private String jdbcPort;
    private String jdbcUsername;
    private String jdbcPassword;

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public String getJdbcDatabaseName() {

        return jdbcDatabaseName;
    }

    public void setJdbcDatabaseName(String jdbcDatabaseName) {
        this.jdbcDatabaseName = jdbcDatabaseName;
    }

    public String getJdbcHost() {
        return jdbcHost;
    }

    public void setJdbcHost(String jdbcHost) {
        this.jdbcHost = jdbcHost;
    }

    public String getJdbcPort() {
        return jdbcPort;
    }

    public void setJdbcPort(String jdbcPort) {
        this.jdbcPort = jdbcPort;
    }

    public String getJdbcUsername() {
        return jdbcUsername;
    }

    public void setJdbcUsername(String jdbcUsername) {
        this.jdbcUsername = jdbcUsername;
    }

}
