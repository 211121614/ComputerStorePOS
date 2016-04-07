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
public class Mainboard implements Serializable{
    
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

        private Mainboard(){
        
    }
    
    private Mainboard(Builder builder)
    {
        this.id = builder.id;
        this.ProductNumber = builder.ProductNumber;
        this.Description = builder.Description;
        this.Stock = builder.Stock;
        this.Price = builder.Price;
    }
    
    public static class Builder {
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
        
        public Builder Mainboard (Mainboard chassis)
        {
            this.id = chassis.id;
            this.ProductNumber = chassis.ProductNumber;
            this.Description = chassis.Description;
            this.Stock = chassis.Stock;
            this.Price = chassis.Price;
            return this;
        }
        
        public Mainboard build() {
            return new Mainboard(this);
        }
        
            
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mainboard)) {
            return false;
        }
        Mainboard other = (Mainboard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
