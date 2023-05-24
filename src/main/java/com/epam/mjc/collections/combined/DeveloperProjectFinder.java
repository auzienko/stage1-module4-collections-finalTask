package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsList = new ArrayList<>();
        for (var entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                projectsList.add(entry.getKey());
            }
        }
        projectsList.sort((a, b) -> {
            Integer al = a.length();
            Integer bl = b.length();

            if (al.equals(bl)) {
                return a.compareTo(b) * -1;
            }
            return al.compareTo(bl) * -1;
        });
        return projectsList;
    }
}
