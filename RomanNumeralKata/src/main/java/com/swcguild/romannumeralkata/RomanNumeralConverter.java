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

        String[] romanValues = new String[]{"X", "V", "I"};
        int[] arabicValues = new int[]{10, 5, 1};

        for (int i = 0; i < romanValues.length; i++) {
            if (raNum == arabicValues[i]) {
                romanNum += romanValues[i];
                raNum -= arabicValues[i];
            }
        }

        return romanNum;
    }
}
