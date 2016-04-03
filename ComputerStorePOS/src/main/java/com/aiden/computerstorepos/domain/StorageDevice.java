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
public class StorageDevice implements Serializable{
    private String ProductNumber;
    private String ProductName;
    private String Manufacturer;
    private String Interface;
    private String Rotationspeed;
    private String Capacity;
    private String Cache;
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

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String Interface) {
        this.Interface = Interface;
    }

    public String getRotationspeed() {
        return Rotationspeed;
    }

    public void setRotationspeed(String Rotationspeed) {
        this.Rotationspeed = Rotationspeed;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String Capacity) {
        this.Capacity = Capacity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getCache() {
        return Cache;
    }

    public void setCache(String Cache) {
        this.Cache = Cache;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StorageDevice data = (StorageDevice) o;

        return ProductNumber == data.ProductNumber;

    }

//    @Override
//    public int hashCode() {
//        return ProcessorNumber;
//    }

    @Override
    public String toString() {
        return "StorageDevice{" +
                "Product Number=" + ProductNumber +
                '}';
    }
}
