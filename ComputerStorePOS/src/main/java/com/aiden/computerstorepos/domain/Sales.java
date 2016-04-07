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
public class Sales implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String id;
    private String SalesId;
    private int EmpID;
    private String Date;
    private double TotalSales;

    public String getId() {
        return id;
    }

    public String getSalesId() {
        return SalesId;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getDate() {
        return Date;
    }

    public double getTotalSales() {
        return TotalSales;
    }

    private Sales()
    {
        
    }
    
    private Sales(Builder builder)
    {
        this.id = builder.id;
        this.SalesId = builder.SalesId;
        this.EmpID = builder.EmpID;
        this.Date = builder.Date;
        this.TotalSales = builder.TotalSales;
    }
    
    public  static class Builder
    {
        private String id;
        private String SalesId;
        private int EmpID;
        private String Date;
        private double TotalSales;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder salesId(String SalesId) {
            this.SalesId = SalesId;
            return this;
        }

        public Builder empID(int EmpID) {
            this.EmpID = EmpID;
            return this;
        }

        public Builder date(String Date) {
            this.Date = Date;
            return this;
        }

        public Builder totalSales(double TotalSales) {
            this.TotalSales = TotalSales;
            return this;
        }
        
        public Builder Sales (Sales sales)
        {
            this.id = sales.id;
            this.SalesId = sales.SalesId;
            this.EmpID = sales.EmpID;
            this.Date = sales.Date;
            this.TotalSales = sales.TotalSales;
            return this;
        }
        
        public Sales build ()
        {
            return new Sales(this);
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
        // TODO: Warning - this method won't work in the case the id fields are not 
        if (!(object instanceof Sales)) {
            return false;
        }
        Sales other = (Sales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}

