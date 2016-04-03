/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.services.PrinterService;

/**
 *
 * @author Aidem
 */
public class PrinterServiceImpl implements PrinterService{
    
    public Printer getPrinter()
    {
        Printer printer = new Printer();
        printer.setProductNumber("4103B003");
        printer.setProductName("Canon PIXMA iP2700") ;
        printer.setManufacturer("Canon");
        printer.setPrinterType("Photo printer - ink-jet - color");
        printer.setPowerDeviceType("power adapter");
        printer.setConnectivityTechnology("wired");
        printer.setPrice (449);
        return printer;
    }
}
