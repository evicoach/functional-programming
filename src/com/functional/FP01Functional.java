package com.functional;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printAllNumbersInListFunctional(integers);
        printEvenNumbersInListFunctional(integers);
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    private static void printEvenNumbersInListFunctional(List<Integer> integers) {
        integers.stream().filter(FP01Functional::isEven)
                .forEach(System.out::println);
    }

    public static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> integers) {
        integers.stream().forEach(FP01Functional::print);
    }
}
