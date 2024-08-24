package com.jatin.jdbc_project.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jatin.jdbc_project.entity.Student;

/**
 * StudentJDBCTemplate
 */
public class StudentJDBCTemplate implements StudentDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String SQL = "INSERT INTO student(name, age) values(?,?)";
        jdbcTemplateObject.update(SQL, name, age);
        System.out.println("Created record");
    }

    @Override
    public List<Student> listStudents() {
        String SQL = "SELECT * FROM student";
        List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }

    @Override
    public Student getStudent(Integer id) {
        String SQL = "SELECT * FROM student WHERE id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL, new StudentMapper(), id);
        return student;
    }

    @Override
    public void updateAge(Integer id, Integer age) {
        String SQL = "UPDATE student SET age = ? WHERE id = ?";
        jdbcTemplateObject.update(SQL, age, id);
    }

    @Override
    public void deleteStudent(Integer id) {
        String SQL = "DELETE FROM student WHERE id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted record with id: " + id);
    }

}
