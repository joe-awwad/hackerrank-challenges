package com.joeaouad.hackerrank.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaircaseTest {

    @Test
    void shouldBuildStaircaseString() {
        assertEquals("   #\n  ##\n ###\n####", Staircase.getStaircaseString(4));
    }

    @Test
    void shouldDisplayStaircaseOf6() {
        Staircase.staircase(6);
    }

    @Test
    void shouldBuildStaircaseStringForJava8() {
        assertEquals("   #\n  ##\n ###\n####", Staircase.getStaircaseStringJava8(4));
    }

    @Test
    void shouldDisplayStaircaseOf6StringForJava8() {
        Staircase.staircaseJava8(6);
    }
}