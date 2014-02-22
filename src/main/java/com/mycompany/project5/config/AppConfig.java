/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project5.config;

import com.mycompany.project5.service.Numbers;
import com.mycompany.project5.service.Impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean(name="number array")
    public Numbers getService(){
        return new Project5Service();
    }
    
}
