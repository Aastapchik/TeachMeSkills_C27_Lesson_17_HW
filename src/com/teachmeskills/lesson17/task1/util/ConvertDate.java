package com.teachmeskills.lesson17.task1.util;

public class ConvertDate {

    public static String convertDate(int n){
        if(n == 1) return "Воскресенье";
        if(n == 2) return "Понедельник";
        if(n == 3) return "Вторник";
        if(n == 4) return "Среда";
        if(n == 5) return "Четверг";
        if(n == 6) return "Пятница";
        if(n == 7) return "Суббота";
        else return "";
    }

    public static int convertNum(String s){
        char[] chars = s.toCharArray();
        if(chars[0] == '0') return Integer.parseInt(String.valueOf(chars[1]));
        return Integer.parseInt(s);
    }
}
