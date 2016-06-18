package com.swcguild.romannumeralkata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freebagelbob
 */
public class RomanNumeralConverterTest {

    @Test
    public void convertArabicOneToRomanI() {
        assertEquals("I", RomanNumeralConverter.convertToRomanNumeral(1));
    }
    
    @Test
    public void convertArabicTwoToRomanII() {
        assertEquals("II", RomanNumeralConverter.convertToRomanNumeral(2));
    }
    
    @Test
    public void convertArabicThreeToRomanIII() {
        assertEquals("III", RomanNumeralConverter.convertToRomanNumeral(3));
    }
    
    @Test
    public void convertArabicFiveToRomanV() {
        assertEquals("V", RomanNumeralConverter.convertToRomanNumeral(5));
    }
    
    @Test
    public void convertArabicSixToRomanVI() {
        assertEquals("VI", RomanNumeralConverter.convertToRomanNumeral(6));
    }
    
//    @Test
//    public void convertArabicNineToRomanIX() {
//        assertEquals("IX", RomanNumeralConverter.convertToRomanNumeral(9));
//    }
    
    @Test
    public void convertArabicTenToRomanX() {
        assertEquals("X", RomanNumeralConverter.convertToRomanNumeral(10));
    }

}
