package com.swcguild.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors4 {

    public static List<Integer> populate(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int factor = 2; n > 1; factor++) {
            for (; n % factor == 0; n /= factor) {
                primes.add(factor);

            }

        }

        return primes;
    }

}
