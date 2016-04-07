/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.StorageDevice;
import com.aiden.computerstorepos.factories.Impl.StorageDeviceFactoriesImpl;
import com.aiden.computerstorepos.factories.StorageDeviceFactories;
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
        private StorageDeviceFactories factory;
    public StorageDeviceTest() {
    }

    @Test
    public void testStorageDeviceCreation() throws Exception {
        StorageDevice storageDevice = factory.createStorageDevice("WD4003FZEX",50,"Western Digital 4TB WD4003FZEX",3699.00);
        Assert.assertEquals(storageDevice.getDescription(),"Western Digital 4TB WD4003FZEX");
        Assert.assertEquals(storageDevice.getProductNumber(),"WD4003FZEX");
        Assert.assertNotNull(storageDevice.getId());
    }

    @Test
    public void testStorageDeviceUpdate() throws Exception {
        StorageDevice storageDevice = factory.createStorageDevice("WD4003FZEX",50,"Western Digital 4TB WD4003FZEX",3699.00);
        Assert.assertEquals(storageDevice.getDescription(),"Western Digital 4TB WD4003FZEX");
        Assert.assertEquals(storageDevice.getProductNumber(),"WD4003FZEX");
        Assert.assertNotNull(storageDevice.getId());

        // Updated Description

        StorageDevice updateStorageDevice = new StorageDevice.Builder()
                .StorageDevice(storageDevice)
                .price(3999.00)
                .build();

        Assert.assertEquals(updateStorageDevice.getPrice(),3999.00);
        Assert.assertEquals(storageDevice.getProductNumber(),updateStorageDevice.getProductNumber());
        Assert.assertEquals(storageDevice.getId(),updateStorageDevice.getId());




    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        factory = StorageDeviceFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
