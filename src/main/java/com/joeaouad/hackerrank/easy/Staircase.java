package com.joeaouad.hackerrank.easy;

public class Staircase {

    static void staircase(int n) {
        System.out.println(getStaircaseString(n));
    }

    static void staircaseJava8(int n) {
        System.out.println(getStaircaseStringJava8(n));
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

    static String getStaircaseStringJava8(int n) {
        StringBuilder builder = new StringBuilder();
        for (int line = 1; line < n + 1; line++) {
            builder.append(repeatString(" ", n - line));
            builder.append(repeatString("#", line));
            if (line < n) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }

    private static String repeatString(String value, int count) {
        return new String(new char[count]).replace("\0", value);
    }
}
