/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project6.config;

import com.mycompany.project6.service.Addition;
import com.mycompany.project6.service.Impl.Project6Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean(name="addition")
    public Addition getService(){
        return new Project6Service();
    }
    
}
