/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.Sales;
import com.aiden.computerstorepos.domain.Sales;
import com.aiden.computerstorepos.factories.SalesFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class SalesFactoriesImpl implements SalesFactories{
    
    
    private static SalesFactoriesImpl factory = null;
    private String salesId;

    private  SalesFactoriesImpl() {
    }
    public static SalesFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new SalesFactoriesImpl();
        return factory;
    }

    public Sales createSales(String salesId,int empID, String date,double totalSales) {
        Sales  sales = new Sales
                .Builder()
                .id(UUID.randomUUID().toString())
                .salesId(salesId)
                .empID(empID)
                .date(date)
                .totalSales(totalSales)
                .build();
        return sales;
    }
}
