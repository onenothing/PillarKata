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

    @Test
    public void convertArabicNineToRomanIX() {
        assertEquals("IX", RomanNumeralConverter.convertToRomanNumeral(9));
    }

    @Test
    public void convertArabicTenToRomanX() {
        assertEquals("X", RomanNumeralConverter.convertToRomanNumeral(10));
    }

    @Test
    public void convertArabicTwentyToRomanXX() {
        assertEquals("XX", RomanNumeralConverter.convertToRomanNumeral(20));
    }

    @Test
    public void convertArabicFiftyToRomanL() {
        assertEquals("L", RomanNumeralConverter.convertToRomanNumeral(50));
    }

    @Test
    public void convertArabicNumberToRomanNumeralWithValuesWeHaveSoFar() {
        assertEquals("LXXX", RomanNumeralConverter.convertToRomanNumeral(80));
        assertEquals("XXVI", RomanNumeralConverter.convertToRomanNumeral(26));
        assertEquals("XLI", RomanNumeralConverter.convertToRomanNumeral(41));

    }
    
    @Test
    public void convertArabicFortyToRomanXL() {
        assertEquals("XL", RomanNumeralConverter.convertToRomanNumeral(40));
    }
    
    @Test
    public void convertArabicOneHundredToRomanC() {
        assertEquals("C", RomanNumeralConverter.convertToRomanNumeral(100));
    }
    
    @Test
    public void convertArabicNinetyToRomanXC() {
        assertEquals("XC", RomanNumeralConverter.convertToRomanNumeral(90));
    }
    
    @Test
    public void convertArabicOneThousandToRomanM() {
        assertEquals("M", RomanNumeralConverter.convertToRomanNumeral(1000));
    }
    
    @Test
    public void convertArabicNineHundredToRomanCM() {
        assertEquals("CM", RomanNumeralConverter.convertToRomanNumeral(900));
    }
    

}
