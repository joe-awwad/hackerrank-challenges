package com.joeaouad.hackerrank.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingTheLeaderboardTest {

    @Test
    void testClimbingTheLeaderboardGivenFirstProvidedInput() {
        assertEquals(Arrays.asList(6, 4, 2, 1), ClimbingTheLeaderboard.climbingLeaderboard(
                arrayListOf(100, 100, 50, 40, 40, 20, 10),
                arrayListOf(5, 25, 50, 120)));
    }

    @Test
    void testClimbingTheLeaderboardGivenSecondProvidedInput() {
        assertEquals(Arrays.asList(6, 5, 4, 2, 1), ClimbingTheLeaderboard.climbingLeaderboard(
                arrayListOf(100, 90, 90, 80, 75, 60),
                arrayListOf(50, 65, 77, 90, 102)));
    }

    private List<Integer> arrayListOf(Integer... ints) {
        return new ArrayList<>(Arrays.asList(ints));
    }
}