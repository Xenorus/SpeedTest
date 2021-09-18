package com.company;

public class Main {

    public static void main(String[] args) {

        long a = 0;
        Stopwatch.file("Статистика");

        Stopwatch point = new Stopwatch(); //при создании объекта отмечается время создания

        for (int n=0; n<1000000; n++) {
            for (int i = 0; i < 100000; i++) {
                a = a + 2;
            }
        }
        Stopwatch.point("М1");

        a=0;

        for (int n=0; n<100000; n++) {
            for (int i = 0; i < 900000; i++) {
                a = a + 2;
            }
        }
        Stopwatch.point("М2");

        a=0;
        for (int n=0; n<1000000; n++) {
            for (int i = 0; i < 50000; i++) {
                a = a + 2;
            }
        }

        Stopwatch.point("М3");
    }
}
