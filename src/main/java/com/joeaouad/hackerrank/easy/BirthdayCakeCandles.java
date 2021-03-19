package com.joeaouad.hackerrank.easy;

import java.util.List;

public class BirthdayCakeCandles {

    public static long birthdayCakeCandles(List<Integer> candles) {
        int max = candles.stream().mapToInt(o -> o).max().orElse(-1);
        return candles.stream().filter(c -> c == max).count();
    }
}
