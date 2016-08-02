/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.romannumber;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author freebagelbob
 */
public class RomanNumberKata {

    private Map<Integer, String> map;

    public RomanNumberKata() {
        
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

        for (Integer key : map.keySet()) {
            while (num >= key) {
                num -= key;
                result.append(map.get(key));
            }

        }

        return result.toString();

    }

}
