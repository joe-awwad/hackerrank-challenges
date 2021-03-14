package com.joeaouad.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VeryBigSumTest {

    @Test
    void shouldComputeLargeSum() {
        assertEquals(5000000015L, new VeryBigSum().sum(new long[]{1000000001L,
                1000000002L,
                1000000003L,
                1000000004L,
                1000000005L}));
    }
}