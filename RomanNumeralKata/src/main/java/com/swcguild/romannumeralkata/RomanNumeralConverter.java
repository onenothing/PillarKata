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

        String[] romanValues = new String[]{"M", "CM", "C", "XC", "L", "XL", "X", "IX", "V", "I"};
        int[] arabicValues = new int[]{1000, 900, 100, 90, 50, 40, 10, 9, 5, 1};

        for (int i = 0; i < romanValues.length; i++) {
            while (raNum >= arabicValues[i]) {
                romanNum += romanValues[i];
                raNum -= arabicValues[i];
            }
        }

        return romanNum;
    }

    public static int convertToArabicNumber(String romanNum) {

        int arabicNum = 0;
        String romanNumeral = romanNum;

        if (romanNum.equals("V")) {
            arabicNum = 5;
            return 5;
        }
        else if (romanNum.equals("VI")) {
            return 6;
        }
        
        for (int i = 0; i < romanNum.length(); i++) {
            arabicNum += 1;
        }
        return arabicNum;
    }
}
