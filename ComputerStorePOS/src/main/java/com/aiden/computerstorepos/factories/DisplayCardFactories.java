/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.computerstorepos.factories;

import com.aiden.computerstorepos.domain.DisplayCard;
import java.io.Serializable;

/**
 *
 * @author Aidem
 */
public interface DisplayCardFactories {

    DisplayCard createDisplayCard(String productNumber,int stock, String description,double price);
}
