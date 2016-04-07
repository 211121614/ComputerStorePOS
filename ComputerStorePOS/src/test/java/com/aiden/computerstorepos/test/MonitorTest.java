/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Monitor;
import com.aiden.computerstorepos.factories.Impl.MonitorFactoriesImpl;
import com.aiden.computerstorepos.factories.MonitorFactories;
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
public class MonitorTest {
       private MonitorFactories factory;
    public MonitorTest() {
    }

    @Test
    public void testMonitorCreation() throws Exception {
        Monitor monitor = factory.createMonitor("23MP55HQ-P",50,"LG 23MP55HQ-P Widescreen LCD",6117.95);
        Assert.assertEquals(monitor.getDescription(),"LG 23MP55HQ-P Widescreen LCD");
        Assert.assertEquals(monitor.getProductNumber(),"23MP55HQ-P");
        Assert.assertNotNull(monitor.getId());
    }

    @Test
    public void testMonitorUpdate() throws Exception {
        Monitor monitor = factory.createMonitor("23MP55HQ-P",50,"LG 23MP55HQ-P Widescreen LCD",6117.95);
        Assert.assertEquals(monitor.getDescription(),"LG 23MP55HQ-P Widescreen LCD");
        Assert.assertEquals(monitor.getProductNumber(),"23MP55HQ-P");
        Assert.assertNotNull(monitor.getId());

        // Updated Description

        Monitor updateMonitor = new Monitor.Builder()
                .Monitor(monitor)
                .price(7200.00)
                .build();

        Assert.assertEquals(updateMonitor.getPrice(),7200.00);
        Assert.assertEquals(monitor.getProductNumber(),updateMonitor.getProductNumber());
        Assert.assertEquals(monitor.getId(),updateMonitor.getId());




    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        factory = MonitorFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
