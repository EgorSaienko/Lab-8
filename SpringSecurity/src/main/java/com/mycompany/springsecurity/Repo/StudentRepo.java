/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springsecurity.Repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.springsecurity.Model.Student;
/**
 *
 * @author Admin
 */
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{   
    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Integer studentId);
    Student updateStudent(Student student);
    public Student getOne(int parseInt);
    public void deleteById(Integer StudentId);
    public Student save(Student student);
    public Object findById(Integer StudentId);
}