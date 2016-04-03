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
public class Employees {
    
    private int EmpID;
    private String EmpName;
    private String EmpSurname;
    private String EmpJob;

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getEmpSurname() {
        return EmpSurname;
    }

    public void setEmpSurname(String EmpSurname) {
        this.EmpSurname = EmpSurname;
    }

    public String getEmpJob() {
        return EmpJob;
    }

    public void setEmpJob(String EmpJob) {
        this.EmpJob = EmpJob;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employees data = (Employees) o;

        return EmpID == data.EmpID;

    }

    @Override
    public int hashCode() {
        return EmpID;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "Employees ID=" + EmpID +
                '}';
    }
}
