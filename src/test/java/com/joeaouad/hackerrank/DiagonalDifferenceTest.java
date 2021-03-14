package com.joeaouad.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalDifferenceTest {

    @Test
    void diagonalDifference() {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(2, 2, 2),
                Arrays.asList(3, 3, 3)
        );

        assertEquals(2, DiagonalDifference.diagonalDifference(matrix));
    }

    @Test
    void shouldThrowIllegalArgumentGivenNotSquareMatrix() {
        assertThrows(IllegalArgumentException.class, () ->
                DiagonalDifference.diagonalDifference(Arrays.asList(
                        Arrays.asList(1, 2),
                        Arrays.asList(2, 2, 2),
                        Arrays.asList(3, 3, 3)
                ))
        );
    }
}