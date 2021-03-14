package com.joeaouad.hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        if (!isValidInput(a, b)) {
            return Arrays.asList(-1, -1);
        }

        int[] result = new int[]{0, 0};

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                result[0]++;
            }

            if (a.get(i) < b.get(i)) {
                result[1]++;
            }
        }

        return arrayToList(result);
    }

    private static List<Integer> arrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }

        return list;
    }

    private static boolean isValidInput(List<Integer> a, List<Integer> b) {
        if (a == null || a.size() != 3 || b == null || b.size() != 3) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (isNotInRange(a.get(i)) || isNotInRange(b.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNotInRange(int i) {
        return i < 0 || i > 100;
    }
}
