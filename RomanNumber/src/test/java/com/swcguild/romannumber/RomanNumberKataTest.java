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
    public void whenPassedRomanIReturnArabicOne() {
        assertEquals("I", roman.convert(1));
    }
    
    @Test 
    public void whenPassedRomanlReturnArabicOne() {
        assertEquals("V", roman.convert(5));
    }
    
    @Test 
    public void whenPassedRomanXReturnArabicTen() {
        assertEquals("X", roman.convert(10));
    }
    
    @Test 
    public void whenPassedRomanXXReturnArabicTwenty() {
        assertEquals("XX", roman.convert(20));
    }
   
    @Test 
    public void whenPassedRomanIVReturnArabicFour() {
        assertEquals("IV", roman.convert(4));
    }
    
    @Test 
    public void whenPassedRomanCDLXVIIIReturnArabicFourHundredSixtyEight() {
        assertEquals("CDLXVIII", roman.convert(468));
    }
    
    @Test
    public void testZero() {
        try {
            roman.convert(0);
            fail("Argument out of Range is not handled");
        } catch (IllegalArgumentException e) {
        }
    }
    
    @Test
    public void testFourThousand() {
        try {
            roman.convert(4000);
            fail("Argument out of Range is not handled");
        } catch (IllegalArgumentException e) {
        }
    }
  
}
