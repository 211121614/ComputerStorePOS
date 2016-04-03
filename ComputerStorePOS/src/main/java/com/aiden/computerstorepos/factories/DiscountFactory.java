/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories;

import com.aiden.computerstorepos.domain.Discount;
import com.aiden.computerstorepos.domain.DiscountA;
import com.aiden.computerstorepos.domain.DiscountB;
import com.aiden.computerstorepos.domain.DiscountC;

/**
 *
 * @author Aidem
 */
public class DiscountFactory{
    
    public static Double getDiscount(Double value){
        Discount chain = setUpChain();
        return chain.handleRequest(value);
    }

    public static Discount setUpChain(){
        Discount a = new DiscountA();
        Discount b = new DiscountB();
        Discount c = new DiscountC();
        a.setNextDiscount(b);
        b.setNextDiscount(c);
        return a;
    }
}
