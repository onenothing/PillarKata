/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.romannumber;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author freebagelbob
 */
public class RomanNumberKata {
    
    private Map<Integer, String> map;

    public String convert(int num) {
        
        map = new TreeMap<>();
        
        map.put(1, "I");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        
        return map.get(num);

    }

}
