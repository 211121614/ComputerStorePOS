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
public class DisplayCard implements Serializable{
    private String ProductNumber;
    private String ProductName;
    private String Manufacturer;
    private String CUDACores;
    private String GraphicsClock;
    private String ProcessorClock;
    private String MemoryClock;
    private String StandardMemoryConfig;
    private String MemoryInterface;
    private String MemoryInterfaceWidth;
    private String MemoryBandwidth;
    private String MaximumDigitalResolution;
    private String MaximumVGAResolution;
    private double Price;

    public String getProductNumber() {
        return ProductNumber;
    }

    public void setProductNumber(String ProductNumber) {
        this.ProductNumber = ProductNumber;
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

    public String getCUDACores() {
        return CUDACores;
    }

    public void setCUDACores(String CUDACores) {
        this.CUDACores = CUDACores;
    }

    public String getGraphicsClock() {
        return GraphicsClock;
    }

    public void setGraphicsClock(String GraphicsClock) {
        this.GraphicsClock = GraphicsClock;
    }

    public String getProcessorClock() {
        return ProcessorClock;
    }

    public void setProcessorClock(String ProcessorClock) {
        this.ProcessorClock = ProcessorClock;
    }

    public String getMemoryClock() {
        return MemoryClock;
    }

    public void setMemoryClock(String MemoryClock) {
        this.MemoryClock = MemoryClock;
    }

    public String getStandardMemoryConfig() {
        return StandardMemoryConfig;
    }

    public void setStandardMemoryConfig(String StandardMemoryConfig) {
        this.StandardMemoryConfig = StandardMemoryConfig;
    }

    public String getMemoryInterface() {
        return MemoryInterface;
    }

    public void setMemoryInterface(String MemoryInterface) {
        this.MemoryInterface = MemoryInterface;
    }

    public String getMemoryInterfaceWidth() {
        return MemoryInterfaceWidth;
    }

    public void setMemoryInterfaceWidth(String MemoryInterfaceWidth) {
        this.MemoryInterfaceWidth = MemoryInterfaceWidth;
    }

    public String getMemoryBandwidth() {
        return MemoryBandwidth;
    }

    public void setMemoryBandwidth(String MemoryBandwidth) {
        this.MemoryBandwidth = MemoryBandwidth;
    }

    public String getMaximumDigitalResolution() {
        return MaximumDigitalResolution;
    }

    public void setMaximumDigitalResolution(String MaximumDigitalResolution) {
        this.MaximumDigitalResolution = MaximumDigitalResolution;
    }

    public String getMaximumVGAResolution() {
        return MaximumVGAResolution;
    }

    public void setMaximumVGAResolution(String MaximumVGAResolution) {
        this.MaximumVGAResolution = MaximumVGAResolution;
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

        DisplayCard data = (DisplayCard) o;

        return ProductNumber == data.ProductNumber;

    }

//    @Override
//    public int hashCode() {
//        return ProcessorNumber;
//    }

    @Override
    public String toString() {
        return "DisplayCard{" +
                "Product Number=" + ProductNumber +
                '}';
    }
}
