/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.CPU;
import com.aiden.computerstorepos.services.CPUService;
import java.io.Serializable;

/**
 *
 * @author Aidem
 */
public class CPUServiceImpl implements CPUService{
   
        public CPU getCPU() {
            CPU cpu = new CPU();
            cpu.setProcessorNumber("i7-6820HQ");
            cpu.setProductName("Intel Core™ i7-6820HQ Processor");
            cpu.setManufacturer("Intel");
            cpu.setSmartCache("8 MB");
            cpu.setInstructionSet("64-bit");
            cpu.setCores("4");
            cpu.setThreads("8");
            cpu.setProcessorBaseFrequency("2.7 GHz");
            cpu.setMaxTurboFrequency("3.6 GHz");
            cpu.setPrice(5554.26);
            return cpu;
        }
    
}
