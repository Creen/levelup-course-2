package ru.levelup.Lesson06.Lessonwork.dao;

import ru.levelup.Lesson06.Lessonwork.domain.Department;

import java.sql.*;
import java.util.Collection;

public class MysqlDepartmentDao implements DepartmentDao {
    @Override
    public DepartmentDao create(int id, String name, String city) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?createDatabaseIfNotExists=true&serverTimezone=UTC",
                "root",
                "rood"
        )) {
            //insert into department value (id, name, city)
            String sql = "insert into department value(" + id + "," + name + ", " + city + ", " + ")";
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Row affected: " + result);

            //TODO: get department

        }
        return null;
    }

    @Override
    public DepartmentDao update(int id, String name, String city) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Collection<Department> findAll() {
        return null;
    }

    @Override
    public Department findById(int id) {
        return null;
    }
}
