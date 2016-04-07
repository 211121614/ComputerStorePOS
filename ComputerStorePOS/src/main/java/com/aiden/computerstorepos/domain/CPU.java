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

    private static final long serialVersionUID = 1L;
    private String id;
    private String ProductNumber;
    private String Description;
    private int Stock;
    private double Price;
    
   public String getId() {
        return id;
    }
   
     public String getProductNumber() {
        return ProductNumber;
    }

    public String getDescription() {
        return Description;
    }
    
    public int getStock() {
        return Stock;
    }

    public double getPrice() {
        return Price;
    }
    
    private CPU(){  
    }
    
     private CPU(Builder builder) {
        this.id = builder.id;
        this.ProductNumber = builder.ProductNumber;
        this.Description = builder.Description;
        this.Stock = builder.Stock;
        this.Price = builder.Price;
    }
 
    public static class Builder{
        private String id;
        private String ProductNumber;
        private String Description;
        private int Stock;
        private double Price;
        
        public Builder id(String id){
            this.id = id;
            return this;
        }
        
    
        public Builder productNumber(String ProductNumber) {
            this.ProductNumber = ProductNumber;
            return this;
        }



        public Builder description(String Description) {
            this.Description = Description;
            return this;
        }

        public Builder stock(int Stock) {
            this.Stock = Stock;
            return this;
        }   
        
        
        public Builder price(double Price) {
            this.Price = Price;
            return this;
        }

        public Builder CPU(CPU cpu) {
            this.id = cpu.id;
            this.ProductNumber = cpu.ProductNumber;
            this.Description = cpu.Description;
            this.Stock = cpu.Stock;
            this.Price = cpu.Price;
                return this;
            }

        public CPU build() {
            return new CPU(this);
        }
    }

 @Override
    public boolean equals(Object object) {
        if (!(object instanceof CPU)) {
            return false;
        }
        CPU other = (CPU) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if ((this.ProductNumber == null && other.ProductNumber != null) || (this.ProductNumber != null && !this.ProductNumber.equals(other.ProductNumber))) {
            return false;
        }
        
        return true;

    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

}
