package com.joeaouad.hackerrank;

import java.util.Arrays;
import java.util.List;

public class VeryBigSum {

    public long sum(long[] list){
        return Arrays.stream(list).reduce(0L, Long::sum);
    }
}
