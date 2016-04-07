/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.factories.PrinterFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class PrinterFactoriesImpl implements PrinterFactories{
    
   private static PrinterFactoriesImpl factory = null;

    private  PrinterFactoriesImpl() {
    }
    public static PrinterFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new PrinterFactoriesImpl();
        return factory;
    }

    public Printer createPrinter(String productNumber,int stock, String description,double price) {
        Printer  cpu = new Printer
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
