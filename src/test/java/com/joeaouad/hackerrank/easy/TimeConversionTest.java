package com.joeaouad.hackerrank.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeConversionTest {

    private static final String DATE_24H_FORMAT = "12:01:00AM";
    private static final String EXPECTED_MILITARY_FORMAT = "00:01:00";

    @Test
    void shouldConvertDateFrom12To24HourFormat() {
        assertEquals(EXPECTED_MILITARY_FORMAT, TimeConversion.timeConversion(DATE_24H_FORMAT));
    }
}