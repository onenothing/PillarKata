/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.swcguild.primefactorskata.PrimeFactors.populate;
/**
 *
 * @author freebagelbob
 */
public class PrimeFactorsTest {

    public PrimeFactorsTest() {
    }
    
    private List<Integer> list(Integer... ints) {
        return new ArrayList<Integer>(Arrays.asList(ints));
    }
    
    @Test
    public void testOne() {
        assertEquals(list(), populate(1));
    }
    
    @Test
    public void testTwo() {
        assertEquals(list(2), populate(2));
    } 

    @Test
    public void testThree() {
        assertEquals(list(3), populate(3));
    }
    
    @Test
    public void testFour() {
        assertEquals(list(2,2), populate(4));
    }
    
    @Test
    public void testSix() {
        assertEquals(list(2,3), populate(6));
    }
    
    @Test  
    public void testEight() {
        assertEquals(list(2,2,2), populate(8));
    }
    
    @Test
    public void testNine() {
        assertEquals(list(3,3), populate(9));
    }

}

