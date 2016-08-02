/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author freebagelbob
 */
public class PrimeFactors {

    public static List<Integer> populate(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int weiner = 2; n > 1; weiner++) 
            for (; n % weiner == 0; n /= weiner) 
                primes.add(weiner);
      
        return primes;
    }
}
