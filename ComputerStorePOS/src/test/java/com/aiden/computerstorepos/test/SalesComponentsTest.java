/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.SalesComponents;
import com.aiden.computerstorepos.factories.Impl.SalesComponentsFactoriesImpl;
import com.aiden.computerstorepos.factories.SalesComponentsFactories;
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
public class SalesComponentsTest {
       private SalesComponentsFactories factory;
    public SalesComponentsTest() {
    }

    @Test
    public void testSalesComponentsCreation() throws Exception {
        SalesComponents salesComponents = factory.createSalesComponents("1234","1234",2);
        Assert.assertEquals(salesComponents.getProductNumber(),"1234");
        Assert.assertEquals(salesComponents.getSaleID(),"1234");
        Assert.assertNotNull(salesComponents.getId());
    }

    @Test
    public void testSalesComponentsUpdate() throws Exception {
         SalesComponents salesComponents = factory.createSalesComponents("1234","1234",2);
        Assert.assertEquals(salesComponents.getProductNumber(),"1234");
        Assert.assertEquals(salesComponents.getSaleID(),"1234");
        Assert.assertNotNull(salesComponents.getId());

        // Updated Description

        SalesComponents updateSalesComponents = new SalesComponents.Builder()
                .SalesComponents(salesComponents)
                .amount(1)
                .build();

        Assert.assertEquals(updateSalesComponents.getAmount(),1);
        Assert.assertEquals(salesComponents.getProductNumber(),updateSalesComponents.getProductNumber());
        Assert.assertEquals(salesComponents.getSaleID(),updateSalesComponents.getSaleID());
        Assert.assertEquals(salesComponents.getId(),updateSalesComponents.getId());




    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        factory = SalesComponentsFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
