/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.Mainboard;
import com.aiden.computerstorepos.services.MainboardService;
import java.io.Serializable;

/**
 *
 * @author Aidem
 */
public class MainboardServiceImpl implements MainboardService{
    
    public Mainboard getMainboard()
    {
        Mainboard mainboard = new Mainboard();
        mainboard.setProductNumber("MB-AS-X99-A");
        mainboard.setProductName("ASUS X99-A, INTEL S2011-V3");
        mainboard.setManufacturer("ASUS");
        mainboard.setCPU("Intel Socket 2011-v3");
        mainboard.setChipset("Intel X99");
        mainboard.setMemory("DDR4");
        mainboard.setPrice(5299.00);
        return mainboard;
    }
    
}
