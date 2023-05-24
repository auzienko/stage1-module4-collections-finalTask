package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (var i : sourceMap.keySet()) {
            int j = i.length();
            var set = resultMap.get(i.length());
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(i);
            resultMap.put(j, set);
        }
        return resultMap;
    }
}
