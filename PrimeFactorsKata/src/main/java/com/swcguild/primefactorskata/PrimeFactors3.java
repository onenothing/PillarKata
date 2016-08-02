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
public class PrimeFactors3 {

    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();

        for (int deuce = 2; n > 1; deuce++) {
            for (; n % deuce == 0; n /= deuce) {
                primes.add(deuce);
            }
        }

//        int deuce = 2;
//        while (n > 1) {
//            while (n % deuce == 0) {
//                primes.add(deuce);
//                n /= deuce;
//            }
//            deuce++;
//        }
//        if (n > 1) {
//            primes.add(n);
//        }

        return primes;
    }

}
