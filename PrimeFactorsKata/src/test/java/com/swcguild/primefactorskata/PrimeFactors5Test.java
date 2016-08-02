
package com.swcguild.primefactorskata;

import java.util.ArrayList;
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
    
    
    private List<Integer> list() {
        return new ArrayList<>();
    }
    
    @Test
    public void one() {
        assertEquals(list(), prime.generate(1));
    }
    
    
}
