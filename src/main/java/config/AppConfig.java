/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;
import service.Impl.*;
import service.Project1Service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 *
 * @author student
 */
@Configuration
public class AppConfig {

    /**
     *
     * @return
     */
    @Bean(name="float addition")
public Proj getService(){
    return new AdditionOne();
}
        
    
    
}
