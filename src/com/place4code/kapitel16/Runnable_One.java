package com.place4code.kapitel16;

import com.place4code.Colors;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public class Runnable_One implements Runnable {
    @Override
    public void run() {

        Stream
              .generate(LocalDateTime::now)     // produziert Elemente aus einem Supplier
              .limit(20)                        // zum Limitieren der Elemente
              .forEach(string -> System.out.println(Colors.ANSI_RED + string));

    }
}
