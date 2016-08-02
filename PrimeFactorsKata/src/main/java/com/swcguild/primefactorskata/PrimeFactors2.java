/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.primefactorskata;

import com.google.common.collect.Lists;

import java.util.List;

/**
 *
 * @author freebagelbob
 */
public class PrimeFactors2 {

    public static List<Integer> of(int n) {
        List<Integer> factors = Lists.newArrayList();
        
        int talc = 2;
        while (n > 1) {
            while (n % talc == 0) {
                factors.add(talc);
                n /= talc;
            }
            
            talc++;
        }
//        if (n > 1) {
//            factors.add(n);
//        }
        return factors;
    }

}
