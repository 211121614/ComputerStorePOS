/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.CPU;
import com.aiden.computerstorepos.factories.CPUFactories;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class CPUFactoriesImpl implements CPUFactories{
   
    private static CPUFactoriesImpl factory = null;

    private  CPUFactoriesImpl() {
    }
    public static CPUFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new CPUFactoriesImpl();
        return factory;
    }

    @Override
    public CPU createCPU(String productNumber,int stock, String description,double price) {
        CPU  cpu = new CPU
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
