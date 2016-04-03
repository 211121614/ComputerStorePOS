/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.DisplayCard;
import com.aiden.computerstorepos.services.DisplayCardService;
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
public class DisplayCardTest {
    private DisplayCardService service;
    public DisplayCardTest() {
    }

   @Test
    public void testDisplayCard() throws Exception {
        DisplayCard data = service.getDisplayCard();
        Assert.assertEquals(data.getProductNumber(),"210-1GD3-L");
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
        service = (DisplayCardService)ctx.getBean("DisplayCard");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
