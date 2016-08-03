package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors5 {

    public static List<Integer> generate(int num) {

        List<Integer> primes = new ArrayList<>();
         
        int digit = 2;
        if (num > 1) {
            while (num % digit == 0) {
                primes.add(digit);
                num /= digit;
            }

            if (num > 1) {
                primes.add(num);
            }
        }
        return primes;
    }

}
