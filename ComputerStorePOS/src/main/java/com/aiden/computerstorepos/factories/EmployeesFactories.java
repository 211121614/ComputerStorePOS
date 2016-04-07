/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories;

import com.aiden.computerstorepos.domain.Employees;

/**
 *
 * @author Aidem
 */
public interface EmployeesFactories {
    Employees createEmployees(int empID, String empName, String empSurname, String empJob);
}
