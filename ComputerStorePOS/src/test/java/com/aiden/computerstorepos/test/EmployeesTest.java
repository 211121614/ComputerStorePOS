/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Employees;
import com.aiden.computerstorepos.factories.EmployeesFactories;
import com.aiden.computerstorepos.factories.Impl.EmployeesFactoriesImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Aidem
 */
public class EmployeesTest {
        private EmployeesFactories factory;
    public EmployeesTest() {
    }

    @Test
    public void testEmployeesCreation() throws Exception {
        Employees emp = factory.createEmployees(211121614,"Aiden","Page","Casher");
        Assert.assertEquals(emp.getEmpID(),211121614);
        Assert.assertEquals(emp.getEmpName(),"Aiden");
        Assert.assertNotNull(emp.getId());
    }

    @Test
    public void testEmployeesUpdate() throws Exception {
        Employees emp = factory.createEmployees(211121614,"Aiden","Page","Casher");
        Assert.assertEquals(emp.getEmpID(),211121614);
        Assert.assertEquals(emp.getEmpName(),"Aiden");
        Assert.assertNotNull(emp.getId());

        // Updated Description

        Employees updateEmployees = new Employees.Builder()
                .Employees(emp)
                .empSurname("something")
                .build();

        Assert.assertEquals(updateEmployees.getEmpSurname(),"something");
        Assert.assertEquals(emp.getEmpID(),updateEmployees.getEmpID());
        Assert.assertEquals(emp.getId(),updateEmployees.getId());




    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         factory = EmployeesFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
