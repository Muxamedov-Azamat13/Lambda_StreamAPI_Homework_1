package org.example;

import java.util.*;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        double average = list.stream()
                .filter(avg -> avg % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Среднее значение чисел = " + average);

    }

}