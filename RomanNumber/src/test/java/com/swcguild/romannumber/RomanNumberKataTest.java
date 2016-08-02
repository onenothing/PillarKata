/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.romannumber;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freebagelbob
 */
public class RomanNumberKataTest {

    private static RomanNumberKata roman;

    @Before
    public void setUp() {
        roman = new RomanNumberKata();
    }

    @Test
    public void whenPassedArabicNumberOneReturnRomanNumeralI() {
        assertEquals("I", roman.convert(1));
    }

    @Test
    public void whenPassedArabicNumberTenReturnRomanNumeralX() {
        assertEquals("X", roman.convert(10));
    }

    @Test
    public void whenPassedArabicNumberTwentyReturnRomanNumeralXX() {
        assertEquals("XX", roman.convert(20));
    }

    @Test
    public void whenPassedArabicNumberFortyReturnRomanNumeralXL() {
        assertEquals("XL", roman.convert(40));
    }

    @Test
    public void whenPassedArabicNumberFourHundredNinetySixReturnRomanNumeralCDXCVI() {
        assertEquals("CDXCVI", roman.convert(496));
    }

    @Test
    @SuppressWarnings("empty-statement")
    public void whenPassedAZeroAnExceptionIsThrown() {
        try {
            roman.convert(0);
            fail("Argument out of range exception is not handled.");
        } catch (IllegalArgumentException e) {

        }

    }

}
