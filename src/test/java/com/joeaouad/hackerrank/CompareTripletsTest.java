package com.joeaouad.hackerrank;

import com.joeaouad.hackerrank.CompareTriplets;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CompareTripletsTest {

    @Test
    void shouldReturnAliceWins() {
        List<Integer> a = Arrays.asList(3, 2, 1);
        List<Integer> b = Arrays.asList(1, 2, 0);

        assertEquals(Arrays.asList(2, 0), CompareTriplets.compareTriplets(a, b));
    }

    @Test
    void shouldReturnBobWins() {
        List<Integer> a = Arrays.asList(2, 2, 2);
        List<Integer> b = Arrays.asList(3, 3, 3);

        assertEquals(Arrays.asList(0, 3), CompareTriplets.compareTriplets(a, b));
    }

    @Test
    void shouldReturnDraw() {
        List<Integer> a = Arrays.asList(3, 2, 1);
        List<Integer> b = Arrays.asList(1, 2, 3);

        assertEquals(Arrays.asList(1, 1), CompareTriplets.compareTriplets(a, b));
    }

    @Test
    void shouldReturnInvalidGivenBadTestScore() {
        List<Integer> a = Arrays.asList(101, 2, 1);
        List<Integer> b = Arrays.asList(1, 2, 0);

        assertEquals(Arrays.asList(-1, -1), CompareTriplets.compareTriplets(a, b));
    }

    @Test
    void shouldReturnInvalidGivenTooLongScoreArray() {
        List<Integer> a = Arrays.asList(1, 1, 1, 1);
        List<Integer> b = Arrays.asList(1, 2, 0);

        assertEquals(Arrays.asList(-1, -1), CompareTriplets.compareTriplets(a, b));
    }

    @Test
    void shouldReturnInvalidGivenNullScoreArray() {
        assertEquals(Arrays.asList(-1, -1), CompareTriplets.compareTriplets(null, null));
    }

    @Test
    void shouldReturnInvalidGivenEmptyScoreArray() {
        assertEquals(Arrays.asList(-1, -1), CompareTriplets.compareTriplets(new ArrayList<>(), new ArrayList<>()));
    }
}