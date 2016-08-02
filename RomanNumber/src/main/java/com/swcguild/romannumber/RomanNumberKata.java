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
    
    private Map<String, Integer> map;

    public String convert(int num) {
        
        map = new TreeMap<>();
        
        map.put("I", 1);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        return map.toString();

    }

}
