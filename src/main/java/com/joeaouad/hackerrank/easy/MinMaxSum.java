package com.joeaouad.hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {

    static long[] findMinMax(int[] arr) {
        List<Long> sums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    sum += arr[j];
                }
            }
            sums.add(sum);
        }

        return new long[]{findMin(sums), findMax(sums)};
    }

    private static long findMin(List<Long> sums) {
        return sums.stream().mapToLong(a -> a).min().orElse(-1);
    }

    private static long findMax(List<Long> sums) {
        return sums.stream().mapToLong(a -> a).max().orElse(-1);
    }
}
