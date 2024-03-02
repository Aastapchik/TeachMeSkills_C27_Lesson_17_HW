package com.teachmeskills.lesson17.task1.util;

public class Revers {

    public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
