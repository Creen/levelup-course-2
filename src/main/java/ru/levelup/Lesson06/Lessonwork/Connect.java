package ru.levelup.Lesson06.Lessonwork;

import java.sql.*;

public class Connect {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//?createDatabaseIfNotExists=true
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?createDatabaseIfNotExists=true&serverTimezone=UTC",
                "root",
                "rood"
        );
            Statement statement = connection.createStatement()


        ) {

           ResultSet resultSet =
                   statement.executeQuery("select * from employee");
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


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

//        String URL = "jdbc:mysql://localhost:3306/";
//        String USER = "root";
//        String PASSWORD = "rood";
//
//        try {
//            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//    }



