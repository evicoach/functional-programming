package com.functional;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printAllNumbersInListStructured(integers);
        printEvenNumbersInListStructured(integers);
    }

    private static void printEvenNumbersInListStructured(List<Integer> integers) {
        for(int number: integers){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        for(int number: integers){
            System.out.println(number);
        }
    }
}
