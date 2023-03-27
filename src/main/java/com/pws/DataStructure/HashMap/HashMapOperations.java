package com.pws.DataStructure.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {

    public static void displayKey(HashMap<String, Integer> hm) {
        Set<String> set = hm.keySet();
        for (String i : set) {
            System.out.println(hm.get(i));
        }
    }

    public static void displayPair(HashMap<String, Integer> hm) {
        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        for (Map.Entry<String, Integer> i : set) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
