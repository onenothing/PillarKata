package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors5 {

    public static List<Integer> generate(int num) {

        List<Integer> primes = new ArrayList<>();

        if (num > 1) {
            if (num % 2 == 0) {
                primes.add(2);
                num /= 2;
            }
            
            if (num > 1) {
                primes.add(num);
            }
        }
        return primes;
    }

}
