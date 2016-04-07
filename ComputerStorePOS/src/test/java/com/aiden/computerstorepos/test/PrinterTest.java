/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Printer;
import com.aiden.computerstorepos.factories.Impl.PrinterFactoriesImpl;
import com.aiden.computerstorepos.factories.PrinterFactories;
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
public class PrinterTest {
     private PrinterFactories factory;
    public PrinterTest() {
    }

    @Test
    public void testPrinterCreation() throws Exception {
        Printer printer = factory.createPrinter("4103B003",50,"Canon PIXMA iP2700",449.00);
        Assert.assertEquals(printer.getDescription(),"Canon PIXMA iP2700");
        Assert.assertEquals(printer.getProductNumber(),"4103B003");
        Assert.assertNotNull(printer.getId());
    }

    @Test
    public void testPrinterUpdate() throws Exception {
        Printer printer = factory.createPrinter("4103B003",50,"Canon PIXMA iP2700",449.00);
        Assert.assertEquals(printer.getDescription(),"Canon PIXMA iP2700");
        Assert.assertEquals(printer.getProductNumber(),"4103B003");
        Assert.assertNotNull(printer.getId());

        // Updated Description

        Printer updatePrinter = new Printer.Builder()
                .Printer(printer)
                .price(500.00)
                .build();

        Assert.assertEquals(updatePrinter.getPrice(),500.00);
        Assert.assertEquals(printer.getProductNumber(),updatePrinter.getProductNumber());
        Assert.assertEquals(printer.getId(),updatePrinter.getId());




    }


    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
                  factory = PrinterFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
