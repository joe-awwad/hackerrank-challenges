package com.joeaouad.hackerrank.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCakeCandlesTest {

    @Test
    void shouldComputeNumberOfCandlesToBlow() {
        assertEquals(2, BirthdayCakeCandles.birthdayCakeCandles(Arrays.asList(3, 2, 1, 3)));
    }

}