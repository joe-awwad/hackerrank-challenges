package com.joeaouad.hackerrank.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {

    @Test
    void shouldGRadeStudents() {
        assertEquals(Arrays.asList(75, 67, 40, 33),
                GradingStudents.gradingStudents(Arrays.asList(73, 67, 38, 33)));
    }
}