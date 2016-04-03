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
public class Notebook {
    
    private String ProductNumber;
    private String ProductName;
    private String Manufacturer;
    private String Processor;
    private String Memory;
    private String Storage;
    private String Camera;
    private String Display;
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

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String Camera) {
        this.Camera = Camera;
    }

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String Display) {
        this.Display = Display;
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

        Notebook data = (Notebook) o;

        return ProductNumber == data.ProductNumber;

    }

//    @Override
//    public int hashCode() {
//        return ProcessorNumber;
//    }

    @Override
    public String toString() {
        return "Notebook{" +
                "Product Number=" + ProductNumber +
                '}';
    }
}
