package com.company.test.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2020/11/2 13:16
 * Content:
 * https://blog.csdn.net/refuse_debug/article/details/104623902
 * https://blog.csdn.net/refuse_debug/article/details/104623908
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
