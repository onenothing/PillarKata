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

        int eveningPay;
        int bedTimePay;
        int lateNightPay;
        int midnight = 24;

        if (startTime < 17) {
            try {
                throw new Exception("You may not start before 5pm.");
            } catch (Exception ex) {
                Logger.getLogger(BabySitter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (endTime > 4) {
            try {
                throw new Exception("The end time cannot go later than 4am.");
            } catch (Exception ex) {
                Logger.getLogger(BabySitter.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        eveningPay = bedTime - startTime;
        bedTimePay = midnight - bedTime;

        if (endTime > 1 && endTime <= 4) {
            lateNightPay = endTime;

        } else {
            lateNightPay = 0;
        }

        return (eveningPay * 12) + (bedTimePay * 8) + (lateNightPay * 16);

    }
}
