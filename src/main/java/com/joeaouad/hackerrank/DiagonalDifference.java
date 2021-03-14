package com.joeaouad.hackerrank;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> matrix) {
        validateMatrixIsSquare(matrix);

        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < matrix.size(); i++) {
            diagonal1 += matrix.get(i).get(i);
            diagonal2 += matrix.get(i).get(matrix.size() - i - 1);
        }

        return Math.abs(diagonal1 - diagonal2);
    }

    private static void validateMatrixIsSquare(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            if (row.size() != matrix.size()) {
                throw new IllegalArgumentException("Matrix is not square");
            }
        }
    }
}
