/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.domain;

/**
 *
 * @author Aidem
 */
public class PCU {
    private String ProductNumber;
    private String ProductName;
    private String Manufacturer;
    private String Type;
    private String InputVoltage;
    private String OutputCapacity;
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

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getInputVoltage() {
        return InputVoltage;
    }

    public void setInputVoltage(String InputVoltage) {
        this.InputVoltage = InputVoltage;
    }

    public String getOutputCapacity() {
        return OutputCapacity;
    }

    public void setOutputCapacity(String OutputCapacity) {
        this.OutputCapacity = OutputCapacity;
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

        PCU data = (PCU) o;

        return ProductNumber == data.ProductNumber;

    }

//    @Override
//    public int hashCode() {
//        return ProcessorNumber;
//    }

    @Override
    public String toString() {
        return "PCU{" +
                "Processor Number=" + ProductNumber +
                '}';
    }
}
