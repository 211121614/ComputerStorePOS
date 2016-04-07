/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.OpticalDevices;
import com.aiden.computerstorepos.factories.Impl.OpticalDevicesFactoriesImpl;
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
        private OpticalDevicesFactories factory;
    public OpticalDevicesTest() {
    }

    @Test
    public void testOpticalDevicesCreation() throws Exception {
        OpticalDevices opticalDevices = factory.createOpticalDevices("GH24LS70",50,"Internal SATA 24x Super-Multi DVD Rewriter",199.00);
        Assert.assertEquals(opticalDevices.getDescription(),"Internal SATA 24x Super-Multi DVD Rewriter");
        Assert.assertEquals(opticalDevices.getProductNumber(),"GH24LS70");
        Assert.assertNotNull(opticalDevices.getId());
    }

    @Test
    public void testOpticalDevicesUpdate() throws Exception {
        OpticalDevices opticalDevices = factory.createOpticalDevices("GH24LS70",50,"Internal SATA 24x Super-Multi DVD Rewriter",199.00);
        Assert.assertEquals(opticalDevices.getDescription(),"Internal SATA 24x Super-Multi DVD Rewriter");
        Assert.assertEquals(opticalDevices.getProductNumber(),"GH24LS70");
        Assert.assertNotNull(opticalDevices.getId());

        // Updated Description

        OpticalDevices updateOpticalDevices = new OpticalDevices.Builder()
                .OpticalDevices(opticalDevices)
                .price(250.00)
                .build();

        Assert.assertEquals(updateOpticalDevices.getPrice(),250.00);
        Assert.assertEquals(opticalDevices.getProductNumber(),updateOpticalDevices.getProductNumber());
        Assert.assertEquals(opticalDevices.getId(),updateOpticalDevices.getId());




    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        factory = OpticalDevicesFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
