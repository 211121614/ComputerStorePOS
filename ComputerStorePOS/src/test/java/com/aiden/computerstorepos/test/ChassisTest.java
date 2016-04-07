/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Chassis;
import com.aiden.computerstorepos.factories.ChassisFactories;
import com.aiden.computerstorepos.factories.Impl.ChassisFactoriesImpl;
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
public class ChassisTest {
    private ChassisFactories factory;
    public ChassisTest() {
    }

    @Test
    public void testChassisCreation() throws Exception {
        Chassis chassis = factory.createChassis("SGC-2100-KWN1",50,"COOLERMASTER CM STORM SCOUT 2",1699.00);
        Assert.assertEquals(chassis.getDescription(),"COOLERMASTER CM STORM SCOUT 2");
        Assert.assertEquals(chassis.getProductNumber(),"SGC-2100-KWN1");
        Assert.assertNotNull(chassis.getId());
    }

    @Test
    public void testChassisUpdate() throws Exception {
        Chassis chassis = factory.createChassis("SGC-2100-KWN1",50,"COOLERMASTER CM STORM SCOUT 2",1699.00);
        Assert.assertEquals(chassis.getDescription(),"COOLERMASTER CM STORM SCOUT 2");
        Assert.assertEquals(chassis.getProductNumber(),"SGC-2100-KWN1");
        Assert.assertNotNull(chassis.getId());

        // Updated Description

        Chassis updateChassis = new Chassis.Builder()
                .Chassis(chassis)
                .price(2000.00)
                .build();

        Assert.assertEquals(updateChassis.getPrice(),2000.00);
        Assert.assertEquals(chassis.getProductNumber(),updateChassis.getProductNumber());
        Assert.assertEquals(chassis.getId(),updateChassis.getId());




    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         factory = ChassisFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
