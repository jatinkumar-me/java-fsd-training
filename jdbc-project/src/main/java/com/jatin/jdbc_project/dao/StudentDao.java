package com.jatin.jdbc_project.dao;

import java.util.List;

import javax.sql.DataSource;

import com.jatin.jdbc_project.entity.Student;

public interface StudentDao {

    /**
     * To initialize a database connection
     * @param ds
     */
    public void setDataSource(DataSource ds);

    /**
     * To create a student record in the student table
     * @param name
     * @param age
     */
    public void create(String name, Integer age);

    /**
     * List all the students from the student table
     * @return List<Student>
     */
    public List<Student> listStudents();

    /**
     * To get a student based on Id;
     * @param id
     * @return
     */
    public Student getStudent(Integer id);

    /**
     * To update the age of the student
     * @param id
     * @param age
     */
    public void updateAge(Integer id, Integer age);

    /**
     * To delete a student based on id
     * @param id
     */
    public void deleteStudent(Integer id);
}
