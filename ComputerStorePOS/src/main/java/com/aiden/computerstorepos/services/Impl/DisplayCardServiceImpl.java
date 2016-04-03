/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.DisplayCard;
import com.aiden.computerstorepos.services.DisplayCardService;
import java.io.Serializable;

/**
 *
 * @author Aidem
 */
public class DisplayCardServiceImpl implements DisplayCardService{
   
    public DisplayCard getDisplayCard()
    {
        DisplayCard displayCard = new DisplayCard();
        displayCard.setProductNumber("210-1GD3-L");
        displayCard.setProductName("GeForce GTX 210");
        displayCard.setManufacturer("GeForce");
        displayCard.setCUDACores("16");
        displayCard.setGraphicsClock("589MHz");
        displayCard.setProcessorClock("1402MHz");
        displayCard.setMemoryClock("500MHz");
        displayCard.setStandardMemoryConfig("512MB");
        displayCard.setMemoryInterface("GDDR2");
        displayCard.setMemoryInterfaceWidth("64-bit");
        displayCard.setMemoryBandwidth("8.0");
        displayCard.setMaximumDigitalResolution("2560x1600");
        displayCard.setMaximumVGAResolution("2048x1536");
        displayCard.setPrice(499.00);
        return displayCard;
    }
}
