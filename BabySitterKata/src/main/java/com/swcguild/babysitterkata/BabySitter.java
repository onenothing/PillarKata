/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.babysitterkata;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author freebagelbob
 */
public class BabySitter {

    public int calculateWages(int startTime, int endTime, int bedTime) {
        
        if (startTime <= 17) {
            throw new IndexOutOfBoundsException("You may not start before 5pm.");
        }
        return startTime;
    }
}


