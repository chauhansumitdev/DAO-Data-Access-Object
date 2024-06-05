package com.example;

import com.example.entity.Student;
import com.example.dao.StudentDAO;
import jakarta.transaction.SystemException;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SystemException {

        System.out.println( "Starting ..." );

        StudentDAO studentDAO = new StudentDAO();

//        Student student = new Student();
//        student.setAge(20);
//        student.setName("Sumit Chauhan");
//        studentDAO.saveStudent(student);



        List<Student> students = studentDAO.getAllStudents();
        for(Student s : students){
            System.out.println(s.getName() + " - " + s.getAge());
        }


//        student.setName("Peter");
//        studentDAO.updateStudent(student);
//
//        studentDAO.deleteStudent(student.getId());

        HibernateUtil.shutdown();


    }
}
