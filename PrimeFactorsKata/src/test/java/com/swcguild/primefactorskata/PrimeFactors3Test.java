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
import static com.swcguild.primefactorskata.PrimeFactors3.generate;
/**
 *
 * @author freebagelbob
 */
public class PrimeFactors3Test {

    private List<Integer> list(Integer... ints) {
        return new ArrayList<>(Arrays.asList(ints));
    }

    @Test
    public void one() {
//        PrimeFactors3 primeFactors = new PrimeFactors3();
        assertEquals(list(), generate(1));
    }
    
    @Test
    public void two() {
        assertEquals(list(2), generate(2));
    }
    
    @Test
    public void three() {
        assertEquals(list(3), generate(3));
    }
    
    @Test
    public void four() {
        assertEquals(list(2,2), generate(4));
    }
    
    @Test
    public void six() {
        assertEquals(list(2,3), generate(6));
    }
    
    @Test
    public void eight() {
        assertEquals(list(2,2,2), generate(8));
    }
    
    @Test
    public void nine() {
        assertEquals(list(3,3), generate(9));
    }
    
    @Test
    public void multipleNumsTest() {
        assertEquals(list(2,2,2,3,3,5,7,11), generate(27720));
    }
    
    
    
    

}
