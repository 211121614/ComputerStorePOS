/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.DisplayCard;
import com.aiden.computerstorepos.domain.DisplayCard;
import com.aiden.computerstorepos.factories.DisplayCardFactories;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class DisplayCardFactoriesImpl implements DisplayCardFactories{
   
   private static DisplayCardFactoriesImpl factory = null;

    private  DisplayCardFactoriesImpl() {
    }
    public static DisplayCardFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new DisplayCardFactoriesImpl();
        return factory;
    }

    @Override
    public DisplayCard createDisplayCard(String productNumber,int stock, String description,double price) {
        DisplayCard  cpu = new DisplayCard
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
