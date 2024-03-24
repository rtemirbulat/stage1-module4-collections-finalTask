package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        ArrayList<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String key = entry.getKey();
            Set<String> values = entry.getValue();
            if (values.contains(developer)) {
                resultList.add(key);
            }
        }
        resultList.sort(((o1, o2) -> {
            int len1 = o1.length();
            int len2 = o2.length();
            if (len1 == len2) {
                return o2.compareTo(o1);
            }
            return len1 < len2 ? 1 : -1;
        }));

        return resultList;
    }
}
