package ru.levelup.lesson06.jdbc.dao;

import ru.levelup.lesson06.jdbc.domain.Department;

import java.sql.SQLException;
import java.util.Collection;

public interface DepartmentDao {

    //insert
    Department create(int id, String name, String city) throws SQLException;

    //update
    Department update(int id, String name, String city);

    //delete
    void delete(int id);

    //select * from department
    //Возвращем коллекцию, переведем ResultSet в Department
    Collection<Department> findAll();

    Department findById(int id);

}
