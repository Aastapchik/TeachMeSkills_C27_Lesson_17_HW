package com.teachmeskills.lesson17.task1.util;

public class Factorial {

    public static long findFactorial(long n){
        if (n < 0) return 0;
        if(n == 0) return 1;
        if(n > 20) return -5;
        return n*findFactorial(n-1);
    }
}
