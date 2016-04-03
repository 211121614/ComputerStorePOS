/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.SalesComponents;
import com.aiden.computerstorepos.services.SalesComponentsService;

/**
 *
 * @author Aidem
 */
public class SalesComponentsServiceImpl implements SalesComponentsService{
   
    public SalesComponents getSalesComponents()
    {
        SalesComponents salesComponents = new SalesComponents();
        salesComponents.setProductNumber("1234");
        salesComponents.setSaleID("1234");
        salesComponents.setAmount(2);
        return salesComponents;
    }
}
