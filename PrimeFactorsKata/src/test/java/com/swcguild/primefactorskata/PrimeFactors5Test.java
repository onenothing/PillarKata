
package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PrimeFactors5Test {
    
    private PrimeFactors5 prime;
    
    @Before
    public void setUp() {
        prime = new PrimeFactors5();
    }
    
    
    private List<Integer> list(Integer... ints) {
        return new ArrayList<>(Arrays.asList(ints));
    }
    
    @Test
    public void one() {
        assertEquals(list(), prime.generate(1));
    }
    
    @Test
    public void two() {
        assertEquals(list(2), prime.generate(2));
    }
    
    @Test
    public void three() {
        assertEquals(list(3), prime.generate(3));
    }
    
    @Test
    public void four() {
        assertEquals(list(2,2), prime.generate(4));
    }
  
    @Test
    public void six() {
        assertEquals(list(2,3), prime.generate(6));
    }
    
    @Test
    public void eight() {
        assertEquals(list(2,2,2), prime.generate(8));
    }
    
    @Test
    public void nine() {
        assertEquals(list(3,3), prime.generate(9));
    }
    
    
}
