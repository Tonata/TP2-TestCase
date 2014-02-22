/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project2.config;
import com.mycompany.project2.service.Impl.*;
import com.mycompany.project2.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    
    @Bean(name="animals")
    public Animals getService(){
        return new Project2Service();
    }
    
}
