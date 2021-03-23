package com.joeaouad.hackerrank.easy;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    private static final int FIVE = 5;

    private static final int THRESHOLD = 3;

    private static final int FAILING_GRADE_UPPER_LIMIT = 38;

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream()
                .map(GradingStudents::getFinalGrade)
                .collect(Collectors.toList());
    }

    private static int getFinalGrade(int grade) {
        return grade < FAILING_GRADE_UPPER_LIMIT ? grade : getRoundedOrSameGrade(grade);
    }

    private static int getRoundedOrSameGrade(int grade) {
        int upperLimit = grade + (FIVE - grade % FIVE);
        return (upperLimit - grade) < THRESHOLD ? upperLimit : grade;
    }
}
