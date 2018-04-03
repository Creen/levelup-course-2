package ru.levelup.Lesson06.Lessonwork;

import java.sql.*;

public class Connect {

    static {
        try {
            System.out.println("Registering JDBC driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//?createDatabaseIfNotExists=true
        System.out.println("Creating connection to database...");
        System.out.println("Creating table in selected database...");
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?createDatabaseIfNotExists=true&serverTimezone=UTC",
                "root",
                "rood"
        );
//             System.out.println("Creating table in selected database...");
            Statement statement = connection.createStatement()

        ) {

            String sql = "select * from employee";
           ResultSet resultSet =
                   statement.executeQuery(sql);
           while (resultSet.next()){
               int employeeId = resultSet.getInt("id");
               String login = resultSet.getString("login");
               String name = resultSet.getString("name");
               String last_name = resultSet.getString("last_name");
               String email = resultSet.getString("email");
               int departmentId = resultSet.getInt("department_id");
               System.out.println("employeeId " + employeeId + " login " + login + " name " + name +
                                    " last_name " + last_name + " email "+ email + " department_id "+ departmentId);
           }
           statement.executeUpdate(sql);
           System.out.println("Table successfully created...");

           statement.close();
           connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}




