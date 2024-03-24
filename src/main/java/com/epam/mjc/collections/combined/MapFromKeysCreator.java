package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> newMap = new HashMap<>();
        for (Map.Entry<String,Integer> e: sourceMap.entrySet()) {
            String key = e.getKey(); // two == 3 chars
            int length = key.length(); // 3
            Set<String> set = newMap.getOrDefault(length, new HashSet<>());
            set.add(key);
            newMap.put(length, set);
        }
        return newMap;

    }
}
