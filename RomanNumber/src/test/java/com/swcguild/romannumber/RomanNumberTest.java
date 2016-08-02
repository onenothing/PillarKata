
package com.swcguild.romannumber;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class RomanNumberTest {

    private static RomanNumber roman;

    @Before
    public void setUp() {
        roman = new RomanNumber();
    }
    
     @Test
    public void testOne() {
        assertEquals("I", roman.convert(1));
    }
    
    @Test
    public void testTen() {
        assertEquals("X", roman.convert(10));
    }

    @Test
    public void testTwenty() {
        assertEquals("XX", roman.convert(20));
    }

    @Test
    public void testNine() {
        assertEquals("IX", roman.convert(9));
    }
    
    @Test
    public void testSixHundredSixtySix() {
        assertEquals("DCLXVI", roman.convert(666));
    }

    @Test
    public void test754() {
        assertEquals("DCCLIV", roman.convert(754));
    }
    
    @Test
    public void test1989() {
        assertEquals("MCMLXXXIX", roman.convert(1989));
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
    public void testFourThousandOrGreater() {
        try {
            roman.convert(4000);
            fail("Argument out of Range is not handled");
        } catch (IllegalArgumentException e) {
        }
    }
}
