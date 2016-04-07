/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Sales;
import com.aiden.computerstorepos.factories.Impl.SalesFactoriesImpl;
import com.aiden.computerstorepos.factories.SalesFactories;
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
        private SalesFactories factory;
    public SalesTest() {
    }

    @Test
    public void testSalesCreation() throws Exception {
        Sales sales = factory.createSales("cs12345",211121614,"2016/04/03",5000.00,100.00);
        Assert.assertEquals(sales.getSalesId(),"cs12345");
        Assert.assertEquals(sales.getEmpID(),211121614);
        Assert.assertNotNull(sales.getId());
    }

    @Test
    public void testSalesUpdate() throws Exception {
        Sales sales = factory.createSales("cs12345",211121614,"2016/04/03",5000.00, 100.00);
        Assert.assertEquals(sales.getSalesId(),"cs12345");
        Assert.assertEquals(sales.getEmpID(),211121614);
        Assert.assertNotNull(sales.getId());

        // Updated Description

        Sales updateSales = new Sales.Builder()
                .Sales(sales)
                .totalSales(4000.00)
                .build();

        Assert.assertEquals(updateSales.getTotalSales(),4000.00);
        Assert.assertEquals(sales.getSalesId(),updateSales.getSalesId());
        Assert.assertEquals(sales.getId(),updateSales.getId());




    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        factory = SalesFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
