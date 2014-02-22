/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project8.config;

import com.mycompany.project8.service.Impl.Project8Service;
import com.mycompany.project8.service.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean(name="student details")
    public Student getService(){
        return new Project8Service();
    }
}
