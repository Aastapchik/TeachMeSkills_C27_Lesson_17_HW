package com.teachmeskills.lesson17.task1.runner;

import com.teachmeskills.lesson17.task1.util.ConvertDate;
import com.teachmeskills.lesson17.task1.util.Factorial;
import com.teachmeskills.lesson17.task1.util.Revers;
import com.teachmeskills.lesson17.task1.service.MyFunctionalInterface;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Runner {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in); Scanner scanner1 = new Scanner(System.in);) {


            System.out.println("Введите 1, если хотите реверснуть строку.\nВведите 2, если хотите найти факториал числа.\nВведите 3, чтобы найти день недели по текущей дате\nЛюбое другое, чтобы выйти из программы.");
            int k = scanner.nextInt();
            switch (k) {

                case 1: {
                    MyFunctionalInterface<String> myInterface;
                    System.out.print("Введите строку для реверса: ");
                    String s = scanner1.nextLine();
                    myInterface = Revers::reverse;
                    System.out.println("Полученная строка: " + myInterface.myMethod(s));
                    break;
                }
                case 2: {
                    MyFunctionalInterface<Long> myInterface;
                    System.out.print("Введите целое число для нахождения факториала: ");
                    long n = scanner1.nextInt();
                    myInterface = Factorial::findFactorial;
                    if (myInterface.myMethod(n) == -5) {
                        System.out.println("Много взял, давай меньше");
                        break;
                    }
                    System.out.println("Факториал числа " + n + " равен " + myInterface.myMethod(n));
                    break;
                }
                case 3: {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Введите дату в формате дд.мм.гггг: ");
                    String date = scanner2.nextLine();
                    Calendar calendar = Calendar.getInstance();

                    calendar.set(Integer.parseInt(date.split("\\.")[2]), ConvertDate.convertNum(date.split("\\.")[1]) - 1, ConvertDate.convertNum(date.split("\\.")[0]));

                  System.out.println(ConvertDate.convertDate(calendar.get(Calendar.DAY_OF_WEEK)));
                    break;
                }
                default: {
                    System.out.println("Выход");
                }
            }
        }catch (Exception e) {
            System.out.println("Что-то пошло не так. Попробуй еще раз");
        }
    }
}
