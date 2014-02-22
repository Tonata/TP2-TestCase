/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import com.mycompany.project2.service.*;
import com.mycompany.project2.config.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class Project2Test {
    private static Animals service;
   
    public Project2Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void objectEquality() {
        Assert.assertEquals("Object equality test failed", service.getAnimalName(), "cat");
    }
    
    @Test
    public void objectIdentity(){
        Assert.assertSame(service.getAnimalName(), "cat");
    }
    @Test
    public void objectIdentityNon(){
        Assert.assertNotSame(service.getAnimalName(), "dog");
    }
    
    
    

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (Animals)ctx.getBean("animals");
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
