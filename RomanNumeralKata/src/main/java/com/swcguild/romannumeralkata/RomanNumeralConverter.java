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

    private final String[] romanValues = new String[]{"M", "CM", "C", "XC", "L", "XL", "X", "IX", "V", "I"};
    private final int[] arabicValues = new int[]{1000, 900, 100, 90, 50, 40, 10, 9, 5, 1};

    public String convertToRomanNumeral(int raNum) {
        String romanNum = "";

        for (int i = 0; i < romanValues.length; i++) {
            while (raNum >= arabicValues[i]) {
                romanNum += romanValues[i];
                raNum -= arabicValues[i];
            }
        }

        return romanNum;
    }

    public  int convertToArabicNumber(String romanNum) {

        int arabicNum = 0;

        for (int i = 0; i < romanValues.length; i++) {
            
            while (romanNum.startsWith(romanValues[i])) {
                arabicNum += arabicValues[i];
                romanNum = romanNum.substring(romanValues[i].length());
            }

        }
        
        return arabicNum;
        
    }
}
