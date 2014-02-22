/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project4.config;
import com.mycompany.project4.service.*;
import com.mycompany.project4.service.Impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean(name="null")
    public NewInterface getService(){
        return new Project4Service();
    }
    
}
