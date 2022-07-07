package com.functional;

import java.util.List;
import java.util.function.Predicate;

public class FP01FunctionExercise {
    public static  void main(String[] args){
        List<String> strings = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//        printAllStringsFunctional(strings);
//        printAllWordsWithSpring(strings);
        printAllFourLetterWords(strings);
    }

    private static boolean isFourLettersOrMore(String string) {
        return string.length() >= 4;
    }

    private static void printAllFourLetterWords(List<String> strings) {
        strings.stream()
                .filter(FP01FunctionExercise::isFourLettersOrMore)
                .forEach(System.out::println);
    }

    public static boolean hasSpring(String word){
        return word.contains("Spring");
    }

    private static void printAllWordsWithSpring(List<String> strings) {
        strings.stream()
                .filter(FP01FunctionExercise::hasSpring)
                .forEach(System.out::println);
    }

    private static void printAllStringsFunctional(List<String> names) {
        names.stream()
                .forEach(System.out::println);
    }
}
