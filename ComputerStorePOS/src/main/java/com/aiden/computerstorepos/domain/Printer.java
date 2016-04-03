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
public class Printer {
    
    private String ProductNumber;
    private String ProductName; 
    private String Manufacturer;
    private String PrinterType;
    private String PowerDeviceType;
    private String ConnectivityTechnology;
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

    public String getPrinterType() {
        return PrinterType;
    }

    public void setPrinterType(String PrinterType) {
        this.PrinterType = PrinterType;
    }

    public String getPowerDeviceType() {
        return PowerDeviceType;
    }

    public void setPowerDeviceType(String PowerDeviceType) {
        this.PowerDeviceType = PowerDeviceType;
    }

    public String getConnectivityTechnology() {
        return ConnectivityTechnology;
    }

    public void setConnectivityTechnology(String ConnectivityTechnology) {
        this.ConnectivityTechnology = ConnectivityTechnology;
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

        Printer data = (Printer) o;

        return ProductNumber == data.ProductNumber;

    }

//    @Override
//    public int hashCode() {
//        return ProcessorNumber;
//    }

    @Override
    public String toString() {
        return "Printer{" +
                "Product Number=" + ProductNumber +
                '}';
    }
}
