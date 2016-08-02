
package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.swcguild.primefactorskata.PrimeFactors4.populate;


public class PrimeFactors4Test {
    
    @Before
    public void setUp() {
    }
    
    private List<Integer> list(Integer... ints) {
        return new ArrayList<>(Arrays.asList(ints));
    }
    
    @Test
    public void one() {
        assertEquals(list(), populate(1));
    }
    
    @Test
    public void two() {
        assertEquals(list(2), populate(2));
    }
    
    @Test
    public void three() {
        assertEquals(list(3), populate(3));
    }
    
    @Test
    public void four() {
        assertEquals(list(2,2), populate(4));
    }
    
    @Test
    public void six() {
        assertEquals(list(2,3), populate(6));
    }
    
    @Test
    public void eight() {
        assertEquals(list(2,2,2), populate(8));
    }
    
    @Test
    public void nine() {
        assertEquals(list(3,3), populate(9));
    }
   
}
