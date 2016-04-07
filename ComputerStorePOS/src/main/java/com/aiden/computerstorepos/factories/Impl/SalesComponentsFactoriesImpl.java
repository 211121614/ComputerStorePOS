/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.SalesComponents;
import com.aiden.computerstorepos.domain.SalesComponents;
import com.aiden.computerstorepos.factories.SalesComponentsFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class SalesComponentsFactoriesImpl implements SalesComponentsFactories{
   
   private static SalesComponentsFactoriesImpl factory = null;

    private  SalesComponentsFactoriesImpl() {
    }
    public static SalesComponentsFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new SalesComponentsFactoriesImpl();
        return factory;
    }

    @Override
    public SalesComponents createSalesComponents(String productNumber, String saleID,int amount) {
        SalesComponents  salesComponents = new SalesComponents
                .Builder()
                .id(UUID.randomUUID().toString())
                .productNumber(productNumber)
                .saleID(saleID)
                .amount(amount)
                .build();
        return salesComponents;
    }
}
