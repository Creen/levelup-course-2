package ru.levelup.lesson06.jdbc;


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

    //Указываю путь к пропиртиес и записываю в переменную. Вроде по фен шую.
    public static final String TRACK_TO_PROPERTIES = "src/main/resources/config.properties";

    public static void main(String[] args) {

        Connection connection;

        FileInputStream fileInputStream;
        Properties properties = new Properties();

        try {
            fileInputStream = new FileInputStream(TRACK_TO_PROPERTIES);
            properties.load(fileInputStream);

            String nameDatabase = properties.getProperty("name");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            connection = DriverManager.getConnection(nameDatabase, username, password);
            MysqlDepartmentDao myDao = new MysqlDepartmentDao(connection);
            myDao.create(1, "Poland", "Varshava");


//           statement.close();
//           connection.close();

        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}


//?createDatabaseIfNotExists=true
//        System.out.println("Creating connection to database...");
//        System.out.println("Creating table in selected database...");
//        try (Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/employees?createDatabaseIfNotExists=true&serverTimezone=UTC",
//                "root",
//                "rood"
//        );
////             System.out.println("Creating table in selected database...");
//             /*
//             Прежде, чем мы сможем использовать экземпляр Statement для выполнения SQL –
//             запросов, нам необходимо создать такой экземпляр. ДЛя этого используется метод
//             Connection.createStatement().
//             После этго мы можем использовать наш экземпляр statement для выполнения SQL – запросов.
//              */
//            Statement statement = connection.createStatement()
//
//        ) {
//            /* Три метода:
//            boolean execute (String SQL)
//            int executeUpdate (String SQL)
//            ResultSet executeQuery (String SQL)
//             */
//
//            String sql = "select * from employee";
//           ResultSet resultSet =
//                   statement.executeQuery(sql);
//           while (resultSet.next()){
//               int employeeId = resultSet.getInt("id");
//               String login = resultSet.getString("login");
//               String name = resultSet.getString("name");
//               String last_name = resultSet.getString("last_name");
//               String email = resultSet.getString("email");
//               int departmentId = resultSet.getInt("department_id");
//               System.out.println("employeeId " + employeeId + " login " + login + " name " + name +
//                                    " last_name " + last_name + " email "+ email + " department_id "+ departmentId);
//           }
//           statement.executeUpdate(sql);
//           System.out.println("Table successfully created...");
//
//           statement.close();
//           connection.close();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }




