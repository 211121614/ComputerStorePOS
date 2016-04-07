/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories;

import com.aiden.computerstorepos.domain.SalesComponents;

/**
 *
 * @author Aidem
 */
public interface SalesComponentsFactories {
    SalesComponents createSalesComponents(String productNumber, String saleID,int amount);
}
