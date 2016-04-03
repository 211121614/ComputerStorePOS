/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aiden.computerstorepos.domain;

import java.io.Serializable;

/**
 *
 * @author Aidem
 */
public class CPU implements Serializable {

    private String ProcessorNumber;
    private String ProductName;
    private String Manufacturer;
    private String SmartCache;
    private String InstructionSet;
    private String Cores;
    private String Threads;
    private String ProcessorBaseFrequency;
    private String MaxTurboFrequency;
    private double Price;

    public String getProcessorNumber() {
        return ProcessorNumber;
    }

    public void setProcessorNumber(String ProcessorNumber) {
        this.ProcessorNumber = ProcessorNumber;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getSmartCache() {
        return SmartCache;
    }

    public void setSmartCache(String SmartCache) {
        this.SmartCache = SmartCache;
    }

    public String getInstructionSet() {
        return InstructionSet;
    }

    public void setInstructionSet(String InstructionSet) {
        this.InstructionSet = InstructionSet;
    }

    public String getCores() {
        return Cores;
    }

    public void setCores(String Cores) {
        this.Cores = Cores;
    }

    public String getThreads() {
        return Threads;
    }

    public void setThreads(String Threads) {
        this.Threads = Threads;
    }

    public String getProcessorBaseFrequency() {
        return ProcessorBaseFrequency;
    }

    public void setProcessorBaseFrequency(String ProcessorBaseFrequency) {
        this.ProcessorBaseFrequency = ProcessorBaseFrequency;
    }

    public String getMaxTurboFrequency() {
        return MaxTurboFrequency;
    }

    public void setMaxTurboFrequency(String MaxTurboFrequency) {
        this.MaxTurboFrequency = MaxTurboFrequency;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CPU data = (CPU) o;

        return ProcessorNumber == data.ProcessorNumber;

    }

//    @Override
//    public int hashCode() {
//        return ProcessorNumber;
//    }

    @Override
    public String toString() {
        return "CPU{" +
                "Processor Number=" + ProcessorNumber +
                '}';
    }

}
