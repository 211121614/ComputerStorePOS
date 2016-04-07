/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories.Impl;

import com.aiden.computerstorepos.domain.Employees;
import com.aiden.computerstorepos.domain.Employees;
import com.aiden.computerstorepos.factories.EmployeesFactories;
import java.util.UUID;

/**
 *
 * @author Aidem
 */
public class EmployeesFactoriesImpl implements EmployeesFactories{
    
   private static EmployeesFactoriesImpl factory = null;

    private  EmployeesFactoriesImpl() {
    }
    public static EmployeesFactoriesImpl getInstance(){
        if(factory ==null)
            factory = new EmployeesFactoriesImpl();
        return factory;
    }

    @Override
    public Employees createEmployees(int empID, String empName, String empSurname, String empJob) {
        Employees  cpu = new Employees
                .Builder()
                .id(UUID.randomUUID().toString())
                .empID(empID)
                .empName(empName)
                .empSurname(empSurname)
                .empJob(empJob)
                .build();
        return cpu;
    }
}
