/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.StorageDevice;
import com.aiden.computerstorepos.services.StorageDeviceService;
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
public class StorageDeviceTest {
    private StorageDeviceService service;
    public StorageDeviceTest() {
    }

    @Test
    public void testElectricity() throws Exception {
        StorageDevice data = service.getStorageDevice();
        Assert.assertEquals(data.getProductNumber(),"WD4003FZEX");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
                 ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (StorageDeviceService)ctx.getBean("StorageDevice");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
