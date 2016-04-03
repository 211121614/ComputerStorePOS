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
public class Sales {
    
    private String SalesId;
    private int EmpID;
    private String Date;
    private double TotalSales;

    public String getSalesId() {
        return SalesId;
    }

    public void setSalesId(String SalesId) {
        this.SalesId = SalesId;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public double getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(double TotalSales) {
        this.TotalSales = TotalSales;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sales data = (Sales) o;

        return SalesId == data.SalesId;

    }

//    @Override
//    public int hashCode() {
//        return SalesId;
//    }

    @Override
    public String toString() {
        return "Sales{" +
                "Sales Id=" + SalesId +
                '}';
    }
}

