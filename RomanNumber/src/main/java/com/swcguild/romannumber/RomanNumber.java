
package com.swcguild.romannumber;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class RomanNumber {

    private final Map<Integer, String> map;

    public RomanNumber() {
        map = new TreeMap<>(Collections.reverseOrder());

        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }

    public String convert(int num) {

        StringBuilder result = new StringBuilder();
        
        if (num <= 0 || num >= 4000) {
            throw new IllegalArgumentException("Number isn't representable as a Roman Number");
        }

        for (Integer key : map.keySet()) {
            while (num >= key) {
                num -= key;
                result.append(map.get(key));
            }
        }

        return result.toString();
    }

}
