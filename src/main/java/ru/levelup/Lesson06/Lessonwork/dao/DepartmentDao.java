package ru.levelup.Lesson06.Lessonwork.dao;

import ru.levelup.Lesson06.Lessonwork.domain.Department;

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
