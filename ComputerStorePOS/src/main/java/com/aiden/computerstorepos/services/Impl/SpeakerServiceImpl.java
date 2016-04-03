/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.services.SpeakerService;

/**
 *
 * @author Aidem
 */
public class SpeakerServiceImpl implements SpeakerService{
    
    public Speaker getSpeaker()
    {
        Speaker speaker = new Speaker();
        speaker.setProductNumber("PN 980-000354");
        speaker.setProductName("LOGITECH Z323");
        speaker.setManufacturer("LOGITECH");
        speaker.setFrequencyResponse("55 Hz – 20 kHz");
        speaker.setOutputs("3.5mm headphone jack");
        speaker.setPrice(699);
        return speaker;
    }
}
