/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.Memory;
import com.aiden.computerstorepos.domain.Memory;
import com.aiden.computerstorepos.factories.MemoryFactories;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class MemoryFactoriesImpl implements MemoryFactories{
     
   private static MemoryFactoriesImpl factory = null;

    private  MemoryFactoriesImpl() {
    }
    public static MemoryFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new MemoryFactoriesImpl();
        return factory;
    }

    public Memory createMemory(String productNumber,int stock, String description,double price) {
        Memory  cpu = new Memory
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
