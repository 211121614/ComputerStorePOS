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
public class DiscountC extends Discount{
    @Override
    public double handleRequest(double request) {
        if(request > 20000){
            return request-request*0.10;
        }else{
            if (nextDiscount!=null) {
                return nextDiscount.handleRequest(request);
            }
            return request;
        }
    }
}
