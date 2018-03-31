package ru.levelup.Lesson06.Lessonwork.dao;

import ru.levelup.Lesson06.Lessonwork.domain.Department;

import java.sql.SQLException;
import java.util.Collection;

public interface DepartmentDao {

    //insert
    DepartmentDao create(int id, String name, String city) throws SQLException;

    //update
    DepartmentDao update(int id, String name, String city);

    //delete
    void delete(int id);

    //select * from department
    Collection<Department> findAll();

    Department findById(int id);

}
