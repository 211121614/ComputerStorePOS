/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Mainboard;
import com.aiden.computerstorepos.factories.MainboardFactories;
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
public class MainboardTest {
    privatMainboardFactoriesce service;
    public MainboardTest() {
    }

@Test
    public void testMainboard() throws Exception {
        Mainboard data = service.getMainboard();
        Assert.assertEquals(data.getProductNumber(),"MB-AS-X99-A");
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
        serviceMainboardFactoriesvice)ctx.getBean("Mainboard");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
