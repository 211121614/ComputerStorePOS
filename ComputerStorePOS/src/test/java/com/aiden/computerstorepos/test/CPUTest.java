/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.factories.CPUFactories;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Aidem
 */
public class CPUTest {
    private CPUFactories factory;
    public CPUTest() {
    }

    @Test
    public void testCPUCreation() throws Exception {
        CPU role = factory.createCPU("i7-6820HQ", "System Administrator");
        Assert.assertEquals(role.getDescription(),"System Administrator");
        Assert.assertEqualsrtEquals(role.getName(),"ADMIN");
        Assert.assertNotNull(role.getId());
    }


    @Test
    public void testCPUUpdate() throws Exception {
        CPU role = factory.createCPU("ADMIN", "System Administrator");
        Assert.assertEquals(role.getDescription(),"System Administrator");
        Assert.assertEquals(role.getName(),"ADMIN");
        Assert.assertNotNull(role.getId());

        // Updated Description

        CPU updateCPU = new CPU.Builder()
                .copy(role)
                .description("Administrator")
                .build();

        Assert.assertEquals(updateCPU.getDescription(),"Administrator");
        Assert.assertEquals(role.getName(),updateCPU.getName());
        Assert.assertEquals(role.getId(),updateCPU.getId());




    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (CPUFactories)ctx.getBean("CPU");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
