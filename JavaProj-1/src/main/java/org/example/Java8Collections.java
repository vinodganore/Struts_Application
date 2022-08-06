package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Collections {

    public static void main(String[] args) {
        List list = Arrays.asList("Mahendar","vinod","tiru");
        System.out.println(list.stream().getClass());
        System.out.println(list.stream().limit(2).collect(Collectors.toList()));
        System.out.println(list.stream());

    }
}
