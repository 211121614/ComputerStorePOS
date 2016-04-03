/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.Memory;
import com.aiden.computerstorepos.services.MemoryService;
import java.io.Serializable;

/**
 *
 * @author Aidem
 */
public class MemoryServiceImpl implements MemoryService{
     
    public Memory getMemory()
    {
        Memory memory = new Memory();
        memory.setProductNumber("HX318C10FWK2/8");
        memory.setProductName("HyperX FURY DDR3");
        memory.setManufacturer("Kingston Technology Corporation");
        memory.setPrice(1175.95);
        return memory;
    }
}
