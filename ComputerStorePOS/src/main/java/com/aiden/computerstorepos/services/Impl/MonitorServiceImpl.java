/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.Monitor;
import com.aiden.computerstorepos.services.MonitorService;
import java.io.Serializable;

/**
 *
 * @author Aidem
 */
public class MonitorServiceImpl implements MonitorService{
 
    public Monitor getMonitor()
    {
        Monitor monitor = new Monitor();
        monitor.setProductNumber("23MP55HQ-P");
        monitor.setProductName("LG 23MP55HQ-P Widescreen LCD");
        monitor.setManufacturer("LG");
        monitor.setScreenSize("23.00");
        monitor.setScreenMode("Full HD");
        monitor.setBacklightTechnology("LED");
        monitor.setPrice(6117.95);
        return monitor;
    }
}
