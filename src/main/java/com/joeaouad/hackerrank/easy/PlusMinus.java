package com.joeaouad.hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    /**
     * Computes the ratios, up to 6 decimal points, of positive, negative, and zero numbers in the given array.
     *
     * @param arr The provided array.
     * @return an array of positive, negative, and zero ratios, respectively.
     */
    static float[] getPlusMinusZeroRatios(int[] arr) {
        // {positive, negative, zero
        float[] values = {0, 0, 0};
        for (int value : arr) {
            if (value > 0) {
                values[0]++;
            }
            if (value < 0) {
                values[1]++;
            }
            if (value == 0) {
                values[2]++;
            }
        }
        return new float[]{values[0] / arr.length, values[1] / arr.length, values[2] / arr.length};
    }

    static List<String> getPrintableRatios(int[] arr) {
        List<String> toPrint = new ArrayList<>();
        for (float ratio : getPlusMinusZeroRatios(arr)) {
            toPrint.add(String.format("%.6f", ratio));
        }
        return toPrint;
    }
}
