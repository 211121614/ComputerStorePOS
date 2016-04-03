/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Sales;
import com.aiden.computerstorepos.services.SalesService;
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
public class SalesTest {
    private SalesService service;
    public SalesTest() {
    }

    @Test
    public void testSales() throws Exception {
        Sales data = service.getSales();
        Assert.assertEquals(data.getSalesId(),"cs12345");
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
        service = (SalesService)ctx.getBean("Sales");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
