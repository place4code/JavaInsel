package com.place4code.kapitel16;

import com.place4code.Colors;

import java.util.stream.IntStream;

public class Runnable_Two implements Runnable {
    @Override
    public void run() {

        IntStream
                 .range(0, 20)
                 .forEach(number -> System.out.println(Colors.ANSI_BLUE + number));

    }
}
