/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.services.Impl;

import com.aiden.computerstorepos.domain.*;
import com.aiden.computerstorepos.services.NotebookService;

/**
 *
 * @author Aidem
 */
public class NotebookServiceImpl implements NotebookService{
    
    public Notebook getNotebook()
    {
        Notebook notebook = new Notebook();
        notebook.setProductNumber ("A555LN-XX299H");
        notebook.setProductName ("Asus A555LN-XX299H");
        notebook.setManufacturer("Asus");
        notebook.setProcessor ("Intel Core I7-5500U Processor");
        notebook.setMemory ("8GB DDR3L 1600 MHz SDRAM");
        notebook.setStorage ("1 TB 5400RPM 2.5 HDD");
        notebook.setCamera ("VGA Web Camera");
        notebook.setDisplay ("15.6 16:9 HD (1366x768)");
        notebook.setPrice (11999);
        return notebook;
    }
}
