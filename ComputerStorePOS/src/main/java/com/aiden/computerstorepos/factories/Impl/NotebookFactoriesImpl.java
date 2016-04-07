/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.factories.NotebookFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class NotebookFactoriesImpl implements NotebookFactories{
    
    private static NotebookFactoriesImpl factory = null;

    private  NotebookFactoriesImpl() {
    }
    public static NotebookFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new NotebookFactoriesImpl();
        return factory;
    }

    public Notebook createNotebook(String productNumber,int stock, String description,double price) {
        Notebook  cpu = new Notebook
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
