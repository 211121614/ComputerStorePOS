/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.factories.ChassisFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class ChassisFactoriesImpl implements ChassisFactories{
    
private static ChassisFactoriesImpl factory = null;

    private  ChassisFactoriesImpl() {
    }
    public static ChassisFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new ChassisFactoriesImpl();
        return factory;
    }

    public Chassis createChassis(String productNumber,int stock, String description,double price) {
        Chassis  chassis = new Chassis
                .Builder()
                .id(UUID.randomUUID().toString())
                .productNumber(productNumber)
                .stock(stock)
                .description(description)
                .price(price)
                .build();
        return chassis;
    }
}
