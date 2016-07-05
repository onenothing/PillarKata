package com.swcguild.romannumeralkata;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author freebagelbob
 */
public class RomanNumeralConverterTest {

    private RomanNumeralConverter rnConverter;
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Before
    public void setUp() {
        rnConverter = new RomanNumeralConverter();
    }
    
     /********************************************
     * Tests for Arabic Number to Roman Numeral
     *********************************************/

    @Test
    public void convertArabicTwoToRomanII() {
        assertEquals("II", rnConverter.convertToRomanNumeral(2));
    }

    @Test
    public void convertArabicFiveToRomanV() {
        assertEquals("V", rnConverter.convertToRomanNumeral(5));
    }

    @Test
    public void convertArabicSixToRomanVI() {
        assertEquals("VI", rnConverter.convertToRomanNumeral(6));
    }

    @Test
    public void convertArabicTenToRomanX() {
        assertEquals("X", rnConverter.convertToRomanNumeral(10));
    }

    @Test
    public void convertArabicTwentyToRomanXX() {
        assertEquals("XX", rnConverter.convertToRomanNumeral(20));
    }

    @Test
    public void convertArabicFiftyToRomanL() {
        assertEquals("L", rnConverter.convertToRomanNumeral(50));
    }

    @Test
    public void convertArabicNumberToRomanNumeralWithValuesWeHaveSoFar() {
        assertEquals("LXXX", rnConverter.convertToRomanNumeral(80));
        assertEquals("XXVI", rnConverter.convertToRomanNumeral(26));
        assertEquals("XLI", rnConverter.convertToRomanNumeral(41));

    }

    @Test
    public void convertArabicFortyToRomanXL() {
        assertEquals("XL", rnConverter.convertToRomanNumeral(40));
    }

    @Test
    public void convertArabicOneHundredToRomanC() {
        assertEquals("C", rnConverter.convertToRomanNumeral(100));
    }

    @Test
    public void convertArabicNinetyToRomanXC() {
        assertEquals("XC", rnConverter.convertToRomanNumeral(90));
    }

    @Test
    public void convertArabicOneThousandToRomanM() {
        assertEquals("M", rnConverter.convertToRomanNumeral(1000));
    }

    @Test
    public void convertArabicNineHundredToRomanCM() {
        assertEquals("CM", rnConverter.convertToRomanNumeral(900));
    }

    @Test
    public void convertArabicNumberToRomanNumeralTestCases() {
        assertEquals("I", rnConverter.convertToRomanNumeral(1));
        assertEquals("III", rnConverter.convertToRomanNumeral(3));
        assertEquals("IX", rnConverter.convertToRomanNumeral(9));
        assertEquals("MLXVI", rnConverter.convertToRomanNumeral(1066));
        assertEquals("MCMLXXXIX", rnConverter.convertToRomanNumeral(1989));

    }
    
     /********************************************
     * Tests for Roman Numeral to Arabic Number
     *********************************************/

    @Test
    public void convertRomanNumIToArabicNumber1() {
        assertEquals(1, rnConverter.convertToArabicNumber("I"));
    }

    @Test
    public void convertRomanNumIIToArabicNumber2() {
        assertEquals(2, rnConverter.convertToArabicNumber("II"));
    }

    @Test
    public void convertRomanNumIIIToArabicNumber3() {
        assertEquals(3, rnConverter.convertToArabicNumber("III"));
    }

    @Test
    public void convertRomanNumVToArabicNumber5() {
        assertEquals(5, rnConverter.convertToArabicNumber("V"));
    }

    @Test
    public void convertRomanNumeralsToArabicNumbers() {
        assertEquals(6, rnConverter.convertToArabicNumber("VI"));
        assertEquals(7, rnConverter.convertToArabicNumber("VII"));
        assertEquals(8, rnConverter.convertToArabicNumber("VIII"));

    }

    @Test
    public void convertRomanNumXToArabicNumber10() {
        assertEquals(10, rnConverter.convertToArabicNumber("X"));
    }

    @Test
    public void convertRomanNumIXToArabicNumber9() {
        assertEquals(9, rnConverter.convertToArabicNumber("IX"));
    }

    @Test
    public void convertRomanNumLToArabicNumber50() {
        assertEquals(50, rnConverter.convertToArabicNumber("L"));
    }

    @Test
    public void convertRomanNumXLToArabicNumber40() {
        assertEquals(40, rnConverter.convertToArabicNumber("XL"));
    }
    
    @Test
    public void convertRomanNumCXXIToArabicNumber121() {
        assertEquals(121, rnConverter.convertToArabicNumber("CXXI"));
    }
    
    @Test
    public void convertRomanNumCCCLXXVToArabicNumber375() {
        assertEquals(375, rnConverter.convertToArabicNumber("CCCLXXV"));
    }
    
    @Test
    public void convertRomanNumeralsToArabicNumbersTestCases() {
        assertEquals(1, rnConverter.convertToArabicNumber("I"));
        assertEquals(3, rnConverter.convertToArabicNumber("III"));
        assertEquals(9, rnConverter.convertToArabicNumber("IX"));
        assertEquals(1066, rnConverter.convertToArabicNumber("MLXVI"));
        assertEquals(1989, rnConverter.convertToArabicNumber("MCMLXXXIX"));

    }

}
