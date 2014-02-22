/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project10.config;

import com.mycompany.project10.service.Impl.Project10Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mycompany.project10.service.*;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean(name="simple addition")
    public Digits getService(){
        return new Project10Service();
    }
    
}
