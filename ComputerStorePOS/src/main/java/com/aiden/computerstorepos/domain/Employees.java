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
public class Employees implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String id;
    private int EmpID;
    private String EmpName;
    private String EmpSurname;
    private String EmpJob;

    public String getId() {
        return id;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getEmpSurname() {
        return EmpSurname;
    }

    public String getEmpJob() {
        return EmpJob;
    }

    private Employees(){
        
    }
    
    private Employees (Builder builder)
    {
        this.id = builder.id;
        this.EmpID = builder.EmpID;
        this.EmpName = builder.EmpName;
        this.EmpSurname = builder.EmpSurname;
        this.EmpJob = builder.EmpJob;
    }
 
    public static class Builder
    {
        private String id;
        private int EmpID;
        private String EmpName;
        private String EmpSurname;
        private String EmpJob;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder empID(int EmpID) {
            this.EmpID = EmpID;
            return this;
        }

        public Builder empName(String EmpName) {
            this.EmpName = EmpName;
            return this;
        }

        public Builder empSurname(String EmpSurname) {
            this.EmpSurname = EmpSurname;
            return this;
        }

        public Builder empJob(String EmpJob) {
            this.EmpJob = EmpJob;
            return this;
        }
        
        public Builder Employees (Employees emp)
        {
            this.id = emp.id;
            this.EmpID = emp.EmpID;
            this.EmpName = emp.EmpName;
            this.EmpSurname = emp.EmpSurname;
            this.EmpJob = emp.EmpJob;
            return this;
        }
        
        public Employees build ()
        {
            return new Employees(this);
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
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
