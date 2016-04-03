/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.services.PCUService;

/**
 *
 * @author Aidem
 */
public class PCUServiceImpl implements PCUService{
    
    
    public PCU getPCU()
    {
        PCU pcu = new PCU();
        pcu.setProductNumber("RS-A50-SPHA-D3");
        pcu.setProductName("COOLERMASTER SILENT PRO HYBRID 1050W PSU");
        pcu.setManufacturer("COOLERMASTER");
        pcu.setType("Intel ATX 12V V2.3 & SSI EPS 12V V2.92");
        pcu.setInputVoltage("90-264V");
        pcu.setOutputCapacity("1050W");
        pcu.setPrice(2799);
        
        return pcu;
    }
}
