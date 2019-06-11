package com.place4code.kapitel16;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        AtomicInteger number = new AtomicInteger();
        number.set(0);

        //new Thread(new Runnable_One()).start();
        //new Thread(new Runnable_Two()).start();

        int millis = 13245646;
        System.out.println(TimeUnit.MILLISECONDS.toHours(millis));

        Thread toAsk = new Thread(() -> {
           try {
               TimeUnit.SECONDS.sleep(2);
               System.out.println("sleep 2 s.");
               number.set(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        });

        toAsk.start();

        toAsk.join();
        System.out.println(number);








    }
}
