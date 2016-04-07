/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.factories.PCUFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class PCUFactoriesImpl implements PCUFactories{
    
    
    private static PCUFactoriesImpl factory = null;

    private  PCUFactoriesImpl() {
    }
    public static PCUFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new PCUFactoriesImpl();
        return factory;
    }

    @Override
    public PCU createPCU(String productNumber,int stock, String description,double price) {
        PCU  cpu = new PCU
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
