/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.CPU;
import com.aiden.computerstorepos.factories.CPUFactories;
import com.aiden.computerstorepos.factories.Impl.CPUFactoriesImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Aidem
 */
public class CPUTest {
    private CPUFactories factory;
    public CPUTest() {
    }

    @Test
    public void testCPUCreation() throws Exception {
        CPU cpu = factory.createCPU("i7-6820HQ",50,"INTEL CORE I5 4690K - 3.50GHZ QUAD CORE",3899.00);
        Assert.assertEquals(cpu.getDescription(),"INTEL CORE I5 4690K - 3.50GHZ QUAD CORE");
        Assert.assertEquals(cpu.getProductNumber(),"i7-6820HQ");
        Assert.assertNotNull(cpu.getId());
    }

    @Test
    public void testCPUUpdate() throws Exception {
        CPU cpu = factory.createCPU("i7-6820HQ",50,"INTEL CORE I5 4690K - 3.50GHZ QUAD CORE",3899.00);
        Assert.assertEquals(cpu.getDescription(),"INTEL CORE I5 4690K - 3.50GHZ QUAD CORE");
        Assert.assertEquals(cpu.getProductNumber(),"i7-6820HQ");
        Assert.assertNotNull(cpu.getId());

        // Updated Description

        CPU updateCPU = new CPU.Builder()
                .CPU(cpu)
                .price(4000.00)
                .build();

        Assert.assertEquals(updateCPU.getPrice(),4000.00);
        Assert.assertEquals(cpu.getProductNumber(),updateCPU.getProductNumber());
        Assert.assertEquals(cpu.getId(),updateCPU.getId());




    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
       factory = CPUFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
