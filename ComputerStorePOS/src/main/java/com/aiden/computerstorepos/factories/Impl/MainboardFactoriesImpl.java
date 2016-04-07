/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.Mainboard;
import com.aiden.computerstorepos.domain.Mainboard;
import com.aiden.computerstorepos.factories.MainboardFactories;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class MainboardFactoriesImpl implements MainboardFactories{
    
   private static MainboardFactoriesImpl factory = null;

    private  MainboardFactoriesImpl() {
    }
    public static MainboardFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new MainboardFactoriesImpl();
        return factory;
    }

    public Mainboard createMainboard(String productNumber,int stock, String description,double price) {
        Mainboard  cpu = new Mainboard
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
