/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project7.config;

import com.mycompany.project7.service.Impl.Project7Service;
import com.mycompany.project7.service.NewInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean(name="add")
    public NewInterface getService()
    {
        return new Project7Service();
    }
    
}
