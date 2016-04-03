/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.Employees;
import com.aiden.computerstorepos.services.EmployeesService;

/**
 *
 * @author Aidem
 */
public class EmployeesServiceImpl implements EmployeesService{
    
    public Employees getEmployees()
    {
        Employees emp = new Employees();
        emp.setEmpID(211121614);
        emp.setEmpName("Aiden");
        emp.setEmpSurname("Page");
        emp.setEmpJob("Casher");
        return emp;
    }
}
