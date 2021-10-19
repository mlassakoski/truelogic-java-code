package com.mlassakoski.truelogic;

import java.util.*;
import java.util.stream.Collectors;

public class School {

    private Map<Integer, List<String>> data = new HashMap<>();

    public void addStudent(final String name, final Integer grade) {
        final List<String> studants = new ArrayList(data.getOrDefault(grade, Collections.emptyList()));
        studants.add(name);
        data.put(grade, studants);
    }

    public List<Grade> getSortedRoster() {
        return data.entrySet().stream()
                .map(e -> new Grade(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }
}
