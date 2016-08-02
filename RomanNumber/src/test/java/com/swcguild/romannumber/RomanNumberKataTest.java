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
    public void whenPassedArabicNumberTenReturnRomanNumeral() {
        assertEquals("X", roman.convert(10));
    }
  
}
