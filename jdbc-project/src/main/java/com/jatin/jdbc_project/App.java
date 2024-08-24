package com.jatin.jdbc_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jatin.jdbc_project.dao.StudentJDBCTemplate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        StudentJDBCTemplate studentJDBC = (StudentJDBCTemplate) ctx.getBean("studentDao");
        //
        // studentJDBC.create("Raj", 19);
        // studentJDBC.create("Jatin", 24);
        // studentJDBC.create("Hamilton Masakadza", 39);
        // studentJDBC.create("Faarig Insaan", 23);
        // studentJDBC.create("Beghairat Insaan", 25);
        //
        System.out.println(studentJDBC.listStudents());

        // System.out.println("BEFORE updating");
        // System.out.println(studentJDBC.getStudent(4));
        // studentJDBC.updateAge(4, 29);
        // System.out.println("AFTER updating");
        // System.out.println(studentJDBC.getStudent(4));

        // studentJDBC.deleteStudent(4);

        ((AbstractApplicationContext) ctx).close();
    }
}
