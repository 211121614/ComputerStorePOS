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
public class Monitor implements Serializable{
    private String ProductNumber;
    private String ProductName;
    private String Manufacturer;
    private String ScreenSize;
    private String ScreenMode;
    private String BacklightTechnology;
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

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String ScreenSize) {
        this.ScreenSize = ScreenSize;
    }

    public String getScreenMode() {
        return ScreenMode;
    }

    public void setScreenMode(String ScreenMode) {
        this.ScreenMode = ScreenMode;
    }

    public String getBacklightTechnology() {
        return BacklightTechnology;
    }

    public void setBacklightTechnology(String BacklightTechnology) {
        this.BacklightTechnology = BacklightTechnology;
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

        Monitor data = (Monitor) o;

        return ProductNumber == data.ProductNumber;

    }

//    @Override
//    public int hashCode() {
//        return ProcessorNumber;
//    }

    @Override
    public String toString() {
        return "Monitor{" +
                "Product Number=" + ProductNumber +
                '}';
    }
}
