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

    public int calculateWages(int startTime, int endTime, int bedTime) throws Exception {

        if (startTime < 17) {
            throw new Exception("You may not start before 5pm.");
        }
        if (endTime > 4) {
            throw new Exception("The end time cannot go later than 4am.");

        }
        return startTime + endTime;

    }

    public int eveningPay(int startTime, int endTime, int bedTime) {
        return 12;
    }
    
    public int bedTimePay(int startTime, int endTime, int bedTime) {
        return 8;
    }
}
