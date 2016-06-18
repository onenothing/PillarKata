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
        
        String[] romanValues = new String[] {"X", "V", "I"};
        int[] arabicValues = new int[] {10, 5, 1};
        
        

        if (raNum == 10) {
            romanNum += "X";
            raNum -= 10;

        } else if (raNum >= 5) {
            romanNum = "V";
            raNum -= 5;
        }

        for (int i = 0; i < raNum; i++) {
            romanNum += "I";

        }

        return romanNum;
    }
}
