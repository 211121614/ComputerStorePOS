/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.services.ChassisService;

/**
 *
 * @author Aidem
 */
public class ChassisServiceImpl implements ChassisService{
    
    public Chassis getChassis()
    {
        Chassis chassis = new Chassis();
        chassis.setProductNumber("SGC-2100-KWN1");
        chassis.setProductName("COOLERMASTER CM STORM SCOUT 2");
        chassis.setManufacturer("COOLERMASTER");
        chassis.setType("Mid Tower");
        chassis.setMotherboard("Form Factor Micro-ATX, ATX");
        chassis.setPrice(1699);
        return chassis;
    }
}
