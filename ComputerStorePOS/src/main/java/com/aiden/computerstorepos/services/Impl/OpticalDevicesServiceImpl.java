/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.services.OpticalDevicesService;

/**
 *
 * @author Aidem
 */
public class OpticalDevicesServiceImpl implements OpticalDevicesService{
    
    public OpticalDevices getOpticalDevices()
    {
        OpticalDevices opticalDevices = new OpticalDevices();
        opticalDevices.setProductNumber("GH24LS70");
        opticalDevices.setProductName("Internal SATA 24x Super-Multi DVD Rewriter");
        opticalDevices.setManufacturer("LG");
        opticalDevices.setDriveType("Internal");
        opticalDevices.setInterface("SATA");
        opticalDevices.setDVDWriteSpeed("22x");
        opticalDevices.setCDWriteSpeed("48x");
        opticalDevices.setPrice(199);
        return opticalDevices;
    }
}
