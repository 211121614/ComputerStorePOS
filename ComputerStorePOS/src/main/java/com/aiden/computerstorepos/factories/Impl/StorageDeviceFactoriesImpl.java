/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.StorageDevice;
import com.aiden.computerstorepos.domain.StorageDevice;
import com.aiden.computerstorepos.factories.StorageDeviceFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class StorageDeviceFactoriesImpl implements StorageDeviceFactories{
   
private static StorageDeviceFactoriesImpl factory = null;

    private  StorageDeviceFactoriesImpl() {
    }
    public static StorageDeviceFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new StorageDeviceFactoriesImpl();
        return factory;
    }

    @Override
    public StorageDevice createStorageDevice(String productNumber,int stock, String description,double price) {
        StorageDevice  cpu = new StorageDevice
                .Builder()
                .id(UUID.randomUUID().toString())
                .productNumber(productNumber)
                .stock(stock)
                .description(description)
                .price(price)
                .build();
        return cpu;
    }
}
