/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springsecurity.security;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mycompany.springsecurity.Model.User;
/**
 *
 * @author Admin
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    public void save(User user);
}