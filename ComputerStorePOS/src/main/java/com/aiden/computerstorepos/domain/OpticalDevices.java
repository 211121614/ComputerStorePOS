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
public class OpticalDevices {
    
    private String ProductNumber;
    private String ProductName;
    private String Manufacturer;              
    private String DriveType;	
    private String Interface;
    private String DVDWriteSpeed;
    private String CDWriteSpeed;
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

    public String getDriveType() {
        return DriveType;
    }

    public void setDriveType(String DriveType) {
        this.DriveType = DriveType;
    }

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String Interface) {
        this.Interface = Interface;
    }

    public String getDVDWriteSpeed() {
        return DVDWriteSpeed;
    }

    public void setDVDWriteSpeed(String DVDWriteSpeed) {
        this.DVDWriteSpeed = DVDWriteSpeed;
    }

    public String getCDWriteSpeed() {
        return CDWriteSpeed;
    }

    public void setCDWriteSpeed(String CDWriteSpeed) {
        this.CDWriteSpeed = CDWriteSpeed;
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

        OpticalDevices data = (OpticalDevices) o;

        return ProductNumber == data.ProductNumber;

    }

//    @Override
//    public int hashCode() {
//        return ProcessorNumber;
//    }

    @Override
    public String toString() {
        return "Optical Devices{" +
                "Product Number=" + ProductNumber +
                '}';
    }
}
