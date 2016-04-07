/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.OpticalDevices;
import com.aiden.computerstorepos.factories.OpticalDevicesFactories;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Aidem
 */
public class OpticalDevicesTest {
    privatOpticalDevicesFactoriesce service;
    public OpticalDevicesTest() {
    }

    @Test
    public void testOpticalDevices() throws Exception {
        OpticalDevices data = service.getOpticalDevices();
        Assert.assertEquals(data.getProductNumber(),"GH24LS70");
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
        serviceOpticalDevicesFactoriesvice)ctx.getBean("OpticalDevices");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
