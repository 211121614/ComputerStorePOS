/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.test;

import com.aiden.computerstorepos.conf.AppConfig;
import com.aiden.computerstorepos.domain.Speaker;
import com.aiden.computerstorepos.factories.Impl.SpeakerFactoriesImpl;
import com.aiden.computerstorepos.factories.SpeakerFactories;
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
public class SpeakerTest {
        private SpeakerFactories factory;
    public SpeakerTest() {
    }

    @Test
    public void testSpeakerCreation() throws Exception {
        Speaker speaker = factory.createSpeaker("PN 980-000354",50,"LOGITECH Z323",699.00);
        Assert.assertEquals(speaker.getDescription(),"LOGITECH Z323");
        Assert.assertEquals(speaker.getProductNumber(),"PN 980-000354");
        Assert.assertNotNull(speaker.getId());
    }

    @Test
    public void testSpeakerUpdate() throws Exception {
        Speaker speaker = factory.createSpeaker("PN 980-000354",50,"LOGITECH Z323",699.00);
        Assert.assertEquals(speaker.getDescription(),"LOGITECH Z323");
        Assert.assertEquals(speaker.getProductNumber(),"PN 980-000354");
        Assert.assertNotNull(speaker.getId());

        // Updated Description

        Speaker updateSpeaker = new Speaker.Builder()
                .Speaker(speaker)
                .price(899.00)
                .build();

        Assert.assertEquals(updateSpeaker.getPrice(),899.00);
        Assert.assertEquals(speaker.getProductNumber(),updateSpeaker.getProductNumber());
        Assert.assertEquals(speaker.getId(),updateSpeaker.getId());




    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        factory = SpeakerFactoriesImpl.getInstance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
