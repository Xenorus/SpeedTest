package com.company;

public class Main {

    public static void main(String[] args) {
        long a=0;
        long start = System.nanoTime();
        for (int n=0; n<1000000; n++) {
            for (int i = 0; i < 100000; i++) {
                a = a + 2;
            }
        }
        long stop = System.nanoTime();
        stopwatch(start, stop, 1);
    }

    public static void stopwatch (long start, long stop, int number) {
        System.out.println("Программа " + number + "исполнялась" + ((stop - start)/1000000000) + " сек.");
    }
}
