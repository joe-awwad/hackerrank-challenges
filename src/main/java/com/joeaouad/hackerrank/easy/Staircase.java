package com.joeaouad.hackerrank.easy;

public class Staircase {

    static void staircase(int n) {
        System.out.println(getStaircaseString(n));
    }

    static String getStaircaseString(int n) {
        StringBuilder builder = new StringBuilder();
        for (int line = 1; line < n + 1; line++) {
            builder.append(" ".repeat(n - line));
            builder.append("#".repeat(line));
            if (line < n) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
