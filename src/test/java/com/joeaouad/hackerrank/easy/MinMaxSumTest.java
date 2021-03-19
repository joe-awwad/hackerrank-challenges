package com.joeaouad.hackerrank.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinMaxSumTest {

    @Test
    void testMinMaxSum() {
        long[] minMax = MinMaxSum.findMinMax(new int[]{1, 2, 3, 4, 5});
        Assertions.assertArrayEquals(new long[]{10, 14}, minMax);
    }

    @Test
    void testMinMaxGivenLargeIntsSum() {
        long[] minMax = MinMaxSum.findMinMax(new int[]{156873294, 719583602, 581240736, 605827319, 895647130});
        Assertions.assertArrayEquals(new long[]{2063524951, 2802298787L}, minMax);
    }
}