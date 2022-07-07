package com.functional;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersInListFunctional(List.of(12,9, 13,4,6,2,4,12,15));
    }

    public static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> integers) {
        integers.stream().forEach(FP01Functional::print);
    }
}
