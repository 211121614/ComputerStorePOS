/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.factories.OpticalDevicesFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class OpticalDevicesFactoriesImpl implements OpticalDevicesFactories{
    
    private static OpticalDevicesFactoriesImpl factory = null;

    private  OpticalDevicesFactoriesImpl() {
    }
    public static OpticalDevicesFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new OpticalDevicesFactoriesImpl();
        return factory;
    }

    public OpticalDevices createOpticalDevices(String productNumber,int stock, String description,double price) {
        OpticalDevices  cpu = new OpticalDevices
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
