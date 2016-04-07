/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.Monitor;
import com.aiden.computerstorepos.domain.Monitor;
import com.aiden.computerstorepos.factories.MonitorFactories;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class MonitorFactoriesImpl implements MonitorFactories{
 
    private static MonitorFactoriesImpl factory = null;

    private  MonitorFactoriesImpl() {
    }
    public static MonitorFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new MonitorFactoriesImpl();
        return factory;
    }

    @Override
    public Monitor createMonitor(String productNumber,int stock, String description,double price) {
        Monitor  cpu = new Monitor
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
