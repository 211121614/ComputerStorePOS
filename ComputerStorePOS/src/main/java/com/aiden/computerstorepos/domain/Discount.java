/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.domain;

/**
 *
 * @author Aidem
 */
public abstract class Discount {
     
    Discount nextDiscount;

    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }
    public abstract double handleRequest(double request);
}
