/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Memory;
import com.aiden.computerstorepos.factories.Impl.MemoryFactoriesImpl;
import com.aiden.computerstorepos.factories.MemoryFactories;
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
public class MemoryTest {
        private MemoryFactories factory;
    public MemoryTest() {
    }

    @Test
    public void testMemoryCreation() throws Exception {
        Memory memory = factory.createMemory("HX318C10FWK2/8",50,"HyperX FURY DDR3 8GB",1175.95);
        Assert.assertEquals(memory.getDescription(),"HyperX FURY DDR3 8GB");
        Assert.assertEquals(memory.getProductNumber(),"HX318C10FWK2/8");
        Assert.assertNotNull(memory.getId());
    }

    @Test
    public void testMemoryUpdate() throws Exception {
        Memory memory = factory.createMemory("HX318C10FWK2/8",50,"HyperX FURY DDR3 8GB",1175.95);
        Assert.assertEquals(memory.getDescription(),"HyperX FURY DDR3 8GB");
        Assert.assertEquals(memory.getProductNumber(),"HX318C10FWK2/8");
        Assert.assertNotNull(memory.getId());

        // Updated Description

        Memory updateMemory = new Memory.Builder()
                .Memory(memory)
                .price(1299.00)
                .build();

        Assert.assertEquals(updateMemory.getPrice(),1299.00);
        Assert.assertEquals(memory.getProductNumber(),updateMemory.getProductNumber());
        Assert.assertEquals(memory.getId(),updateMemory.getId());




    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        factory = MemoryFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
