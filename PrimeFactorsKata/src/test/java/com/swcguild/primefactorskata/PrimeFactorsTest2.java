/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.primefactorskata;

import com.google.common.collect.ImmutableList;
import jdk.nashorn.internal.ir.annotations.Immutable;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author freebagelbob
 */
public class PrimeFactorsTest2 {

    @Test
    public void of_1isNone() {
        assertThat(PrimeFactors2.of(1), is(ImmutableList.of()));
    }
    
    @Test
    public void of_2is2() {
        assertThat(PrimeFactors2.of(2), is(ImmutableList.of(2)));
    }
    
    @Test
    public void of_3is3() {
        assertThat(PrimeFactors2.of(3), is(ImmutableList.of(3)));
    }
    
    @Test
    public void of_4is2_2() {
        assertThat(PrimeFactors2.of(4), is(ImmutableList.of(2,2)));
    }
    
    @Test
    public void of_6is2_3() {
        assertThat(PrimeFactors2.of(6), is(ImmutableList.of(2,3)));
    }
    
    @Test
    public void of_8is2_2_2() {
        assertThat(PrimeFactors2.of(8), is(ImmutableList.of(2,2,2)));
    }
    
     @Test
    public void of_9is3_3() {
        assertThat(PrimeFactors2.of(9), is(ImmutableList.of(3,3)));
    }
}
