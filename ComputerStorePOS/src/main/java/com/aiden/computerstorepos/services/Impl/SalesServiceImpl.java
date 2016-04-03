/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.Sales;
import com.aiden.computerstorepos.services.SalesService;

/**
 *
 * @author Aidem
 */
public class SalesServiceImpl implements SalesService{
    
    
    public Sales getSales()
    {
        Sales sales = new Sales();
        sales.setSalesId("cs12345");
        sales.setEmpID(211121614);
        sales.setDate("2016/04/03");
        sales.setTotalSales(5000);
        return sales;
    }
}
