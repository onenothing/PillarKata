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

    private final String[] romanValues = new String[]{"M", "CM", "D", "C", "XC", "L", "XL", "X", "IX", "V", "I"};
    private final int[] arabicValues = new int[]{1000, 900, 500, 100, 90, 50, 40, 10, 9, 5, 1};

    public String convertToRomanNumeral(int arabicNumber) {

        if (arabicNumber < 0 || arabicNumber > 3999) {
            throw new IllegalArgumentException("Number(s) must be between 0 and 3999.");
        }

        String romanNum = "";

        for (int i = 0; i < romanValues.length; i++) {
            while (arabicNumber >= arabicValues[i]) {
                romanNum += romanValues[i];
                arabicNumber -= arabicValues[i];
            }
        }

        return romanNum;
    }

    public int convertToArabicNumber(String romanNum) {

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
