package com.company.test.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2020/4/13 13:16
 * Content:
 */
public class Test {

    public static void main(String[] args) {
        Map<String, Double> hashMap = new HashMap<>();

        hashMap.put("K1", 0.1);
        hashMap.put("K2", 0.2);
        hashMap.put("K3", 0.3);
        hashMap.put("K4", 0.4);

        System.out.println(hashMap.get("K1"));
    }
}
