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
public class Speaker {
    private String ProductNumber;
    private String ProductName;
    private String Manufacturer;
    private String FrequencyResponse;
    private String Outputs;
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

    public String getFrequencyResponse() {
        return FrequencyResponse;
    }

    public void setFrequencyResponse(String FrequencyResponse) {
        this.FrequencyResponse = FrequencyResponse;
    }

    public String getOutputs() {
        return Outputs;
    }

    public void setOutputs(String Outputs) {
        this.Outputs = Outputs;
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

        Speaker data = (Speaker) o;

        return ProductNumber == data.ProductNumber;

    }

//    @Override
//    public int hashCode() {
//        return ProcessorNumber;
//    }

    @Override
    public String toString() {
        return "Speaker{" +
                "Product Number=" + ProductNumber +
                '}';
    }
}
