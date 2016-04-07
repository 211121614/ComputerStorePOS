/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.DisplayCard;
import com.aiden.computerstorepos.factories.DisplayCardFactories;
import com.aiden.computerstorepos.factories.Impl.DisplayCardFactoriesImpl;
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
       private DisplayCardFactories factory;
    public DisplayCardTest() {
    }

    @Test
    public void testDisplayCardCreation() throws Exception {
        DisplayCard displayCard = factory.createDisplayCard("210-1GD3-L",50,"GeForce GTX 210",499.00);
        Assert.assertEquals(displayCard.getDescription(),"GeForce GTX 210");
        Assert.assertEquals(displayCard.getProductNumber(),"210-1GD3-L");
        Assert.assertNotNull(displayCard.getId());
    }

    @Test
    public void testDisplayCardUpdate() throws Exception {
        DisplayCard displayCard = factory.createDisplayCard("210-1GD3-L",50,"GeForce GTX 210",499.00);
        Assert.assertEquals(displayCard.getDescription(),"GeForce GTX 210");
        Assert.assertEquals(displayCard.getProductNumber(),"210-1GD3-L");
        Assert.assertNotNull(displayCard.getId());

        // Updated Description

        DisplayCard updateDisplayCard = new DisplayCard.Builder()
                .DisplayCard(displayCard)
                .price(699.00)
                .build();

        Assert.assertEquals(updateDisplayCard.getPrice(),699.00);
        Assert.assertEquals(displayCard.getProductNumber(),updateDisplayCard.getProductNumber());
        Assert.assertEquals(displayCard.getId(),updateDisplayCard.getId());




    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
       factory = DisplayCardFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
