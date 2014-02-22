/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.project9.config;

import com.mycompany.project9.service.Arithmetic;
import com.mycompany.project9.service.Impl.Project9Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    @Bean(name="bodmas")
    public Arithmetic getService(){
        return new Project9Service();
    }
}
