/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Notebook;
import com.aiden.computerstorepos.factories.Impl.NotebookFactoriesImpl;
import com.aiden.computerstorepos.factories.NotebookFactories;
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
public class NotebookTest {
        private NotebookFactories factory;
    public NotebookTest() {
    }

    @Test
    public void testNotebookCreation() throws Exception {
        Notebook notebook = factory.createNotebook("A555LN-XX299H",50,"Asus A555LN-XX299H",11999.00);
        Assert.assertEquals(notebook.getDescription(),"Asus A555LN-XX299H");
        Assert.assertEquals(notebook.getProductNumber(),"A555LN-XX299H");
        Assert.assertNotNull(notebook.getId());
    }

    @Test
    public void testNotebookUpdate() throws Exception {
        Notebook notebook = factory.createNotebook("A555LN-XX299H",50,"Asus A555LN-XX299H",11999.00);
        Assert.assertEquals(notebook.getDescription(),"Asus A555LN-XX299H");
        Assert.assertEquals(notebook.getProductNumber(),"A555LN-XX299H");
        Assert.assertNotNull(notebook.getId());

        // Updated Description

        Notebook updateNotebook = new Notebook.Builder()
                .Notebook(notebook)
                .price(13500.00)
                .build();

        Assert.assertEquals(updateNotebook.getPrice(),13500.00);
        Assert.assertEquals(notebook.getProductNumber(),updateNotebook.getProductNumber());
        Assert.assertEquals(notebook.getId(),updateNotebook.getId());




    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
       factory = NotebookFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
