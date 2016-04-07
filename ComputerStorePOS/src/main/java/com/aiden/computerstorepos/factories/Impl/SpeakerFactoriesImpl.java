/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.factories.SpeakerFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class SpeakerFactoriesImpl implements SpeakerFactories{
    
    private static SpeakerFactoriesImpl factory = null;

    private  SpeakerFactoriesImpl() {
    }
    public static SpeakerFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new SpeakerFactoriesImpl();
        return factory;
    }

    public Speaker createSpeaker(String productNumber,int stock, String description,double price) {
        Speaker  cpu = new Speaker
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
