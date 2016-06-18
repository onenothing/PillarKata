/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.romannumeralkata;

/**
 *
 * @author freebagelbob
 */
public class RomanNumeralConverter {

    public static String convertToRomanNumeral(int raNum) {
        String romanNum = "";
        
        if (raNum == 5) {
            romanNum = "V";
        }

        switch (raNum) {
            case 3:
                romanNum = "III";
                break;
            case 2:
                romanNum = "II";
                break;
            default:
                romanNum = "I";
                break;
        }
        return romanNum;
    }
}
