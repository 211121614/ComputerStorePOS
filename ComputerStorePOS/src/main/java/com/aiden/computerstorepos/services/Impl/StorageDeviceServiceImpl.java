/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.StorageDevice;
import com.aiden.computerstorepos.services.StorageDeviceService;

/**
 *
 * @author Aidem
 */
public class StorageDeviceServiceImpl implements StorageDeviceService{
   
    public StorageDevice getStorageDevice()
    {
        StorageDevice storageDevice = new StorageDevice();
        storageDevice.setProductNumber("WD4003FZEX");
        storageDevice.setProductName("Western Digital WD4003FZEX");
        storageDevice.setManufacturer("Western Digital");
        storageDevice.setInterface("SATA 6.0Gb/s");
        storageDevice.setRotationspeed("7200 RPM");
        storageDevice.setCapacity("4TB");
        storageDevice.setCache("64MB");
        storageDevice.setPrice(3699.00);
        return storageDevice;
    }
}
