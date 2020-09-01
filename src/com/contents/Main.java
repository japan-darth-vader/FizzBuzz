package com.contents;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100).forEach(i -> {
            System.out.printf("%s：", i);
            if (i % 3 == 0) System.out.print("Fizz");
            if (i % 5 == 0) System.out.print("Buzz");
            System.out.println();
        });
    }
}
