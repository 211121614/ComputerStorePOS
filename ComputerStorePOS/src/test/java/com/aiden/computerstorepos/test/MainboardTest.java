/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Mainboard;
import com.aiden.computerstorepos.factories.Impl.MainboardFactoriesImpl;
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
        private MainboardFactories factory;
    public MainboardTest() {
    }

    @Test
    public void testMainboardCreation() throws Exception {
        Mainboard mainboard = factory.createMainboard("MB-AS-X99-A",50,"ASUS X99-A",5299.00);
        Assert.assertEquals(mainboard.getDescription(),"ASUS X99-A");
        Assert.assertEquals(mainboard.getProductNumber(),"MB-AS-X99-A");
        Assert.assertNotNull(mainboard.getId());
    }

    @Test
    public void testMainboardUpdate() throws Exception {
        Mainboard mainboard = factory.createMainboard("MB-AS-X99-A",50,"ASUS X99-A",5299.00);
        Assert.assertEquals(mainboard.getDescription(),"ASUS X99-A");
        Assert.assertEquals(mainboard.getProductNumber(),"MB-AS-X99-A");
        Assert.assertNotNull(mainboard.getId());

        // Updated Description

        Mainboard updateMainboard = new Mainboard.Builder()
                .Mainboard(mainboard)
                .price(5699.00)
                .build();

        Assert.assertEquals(updateMainboard.getPrice(),5699.00);
        Assert.assertEquals(mainboard.getProductNumber(),updateMainboard.getProductNumber());
        Assert.assertEquals(mainboard.getId(),updateMainboard.getId());




    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
       factory = MainboardFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
