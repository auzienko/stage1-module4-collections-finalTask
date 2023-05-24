package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> resultSet = new HashSet<>();
        timetable.values().forEach(resultSet::addAll);
        return resultSet;
    }
}
