/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.PCU;
import com.aiden.computerstorepos.factories.Impl.PCUFactoriesImpl;
import com.aiden.computerstorepos.factories.PCUFactories;
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
public class PCUTest {
       private PCUFactories factory;
    public PCUTest() {
    }

    @Test
    public void testPCUCreation() throws Exception {
        PCU pcu = factory.createPCU("RS-A50-SPHA-D3",50,"COOLERMASTER SILENT PRO HYBRID 1050W PSU",2799.00);
        Assert.assertEquals(pcu.getDescription(),"COOLERMASTER SILENT PRO HYBRID 1050W PSU");
        Assert.assertEquals(pcu.getProductNumber(),"RS-A50-SPHA-D3");
        Assert.assertNotNull(pcu.getId());
    }

    @Test
    public void testPCUUpdate() throws Exception {
        PCU pcu = factory.createPCU("RS-A50-SPHA-D3",50,"COOLERMASTER SILENT PRO HYBRID 1050W PSU",2799.00);
        Assert.assertEquals(pcu.getDescription(),"COOLERMASTER SILENT PRO HYBRID 1050W PSU");
        Assert.assertEquals(pcu.getProductNumber(),"RS-A50-SPHA-D3");
        Assert.assertNotNull(pcu.getId());

        // Updated Description

        PCU updatePCU = new PCU.Builder()
                .PCU(pcu)
                .price(3099.00)
                .build();

        Assert.assertEquals(updatePCU.getPrice(),3099.00);
        Assert.assertEquals(pcu.getProductNumber(),updatePCU.getProductNumber());
        Assert.assertEquals(pcu.getId(),updatePCU.getId());




    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        factory = PCUFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
