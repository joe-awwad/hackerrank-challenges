package com.joeaouad.hackerrank.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusMinusTest {

    @Test
    void shouldComputePlusMinusZeroRatios() {
        assertEquals(Arrays.asList("0.500000", "0.333333", "0.166667"),
                PlusMinus.getPrintableRatios(new int[]{1, 2, 3, -4, -2, 0}));
    }
}