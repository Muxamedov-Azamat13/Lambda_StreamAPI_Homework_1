package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream()
                .filter(avg -> avg % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(avg -> System.out.println("Среднее значение чисел = " + avg));

    }

}