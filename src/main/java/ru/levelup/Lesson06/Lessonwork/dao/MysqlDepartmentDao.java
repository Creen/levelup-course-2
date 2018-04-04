package ru.levelup.Lesson06.Lessonwork.dao;

import ru.levelup.Lesson06.Lessonwork.domain.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
/*
        Прежде, чем мы сможем использовать экземпляр Statement для выполнения SQL –
        запросов, нам необходимо создать такой экземпляр. ДЛя этого используется метод
        Connection.createStatement().
        После этго мы можем использовать наш экземпляр statement для выполнения SQL – запросов.
        boolean execute (String SQL)
        int executeUpdate (String SQL)
        ResultSet executeQuery (String SQL)
        */

public class MysqlDepartmentDao implements DepartmentDao {

    private Connection connection;

    public MysqlDepartmentDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Department create(int id, String name, String city) throws SQLException {
        //insert into department value (id, name, city)
            String sql = "insert into department value(" + id + ", " + name + ", " + city  + ")";
            Statement statement = connection.createStatement();
        //Возвращает число обработанных строк
            int result = statement.executeUpdate(sql);
            System.out.println("Row affected: " + result);
            if (result == 1){
                return findById(id);
            } else if (result == 0){
                System.out.println("Не получилось");
            }
        return null;
    }

    @Override
    public Department update(int id, String name, String city) {
        //Запрос SQL: update department set name = name, city = city where department_id = id;
        String sql = "updata department set name = " + name + ", city = " + city + " where department_id" + id;
        try {
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(sql);
            if (result == 1){
                return findById(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        //Запрос на SQL: delete from department where department_id = id
        String sql = "delete from department where department_id = id";
        try {
            Statement statement = connection.createStatement();
            int deleteRow = statement.executeUpdate(sql);
            if (deleteRow == 0){
                System.out.println("Ряд удален");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Collection<Department> findAll() {


        ArrayList<Department> departments = new ArrayList<>();
        //Запрос SQL: select * from department
        String sql = "select * from department";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("department_id");
                String name = resultSet.getString("name");
                String city = resultSet.getString("city");
                Department department = new Department(id, name, city);
                departments.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departments;
    }

    @Override
    public Department findById(int id) {
        //Запрос SQL: select * from department where department_id
        String sql = "select * from department where department_id" +id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int idDepartament = resultSet.getInt("department_id");
                String nameDepartament = resultSet.getString("name");
                String cityDepartament = resultSet.getString("city");
                Department d = new Department(idDepartament, nameDepartament, cityDepartament);
                return d;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
