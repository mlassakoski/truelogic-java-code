package com.mlassakoski.truelogic;

import java.util.List;

public class Grade {

    private Integer grade;
    private List<String> studantds;

    public Grade(final Integer grade, final List<String> studantds) {
        this.grade = grade;
        this.studantds = studantds;
    }

    public Integer getGrade() {
        return grade;
    }

    public List<String> getStudantds() {
        return studantds;
    }
}
