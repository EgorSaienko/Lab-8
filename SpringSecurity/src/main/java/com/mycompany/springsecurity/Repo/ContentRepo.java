/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springsecurity.Repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.mycompany.springsecurity.Model.Content;
import com.mycompany.springsecurity.Model.Student;
/**
 *
 * @author Admin
 */
@Repository
public interface ContentRepo extends JpaRepository<Student, Integer>{
    @Query("from disciplines where student_id= :id")
    List<Content> getMarksByStId(@Param("id") int id);
}
