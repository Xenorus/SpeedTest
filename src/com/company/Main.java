package com.company;

public class Main {

    public static void main(String[] args) {

        long a = 0;
        int counter = 0;
        Stopwatch.file("Статистика");

        Stopwatch point1 = new Stopwatch(); //при создании объекта отмечается время создания
        for (int n=0; n<1000000; n++) {
            for (int i = 0; i < 100000; i++) {
                a = a + 2;
            }
        }
        counter++;

        Stopwatch.point(point1.getStart(), System.nanoTime(), counter);
        //передаем методу время создания, текущее время (т.е. время окончания) и порядковый номер


        a=0;

        Stopwatch point2 = new Stopwatch(point1.getStop());
        for (int n=0; n<100000; n++) {
            for (int i = 0; i < 900000; i++) {
                a = a + 2;
            }
        }
        counter++;
        Stopwatch.point(point2.getStart(), System.nanoTime(), counter);

        a=0;
        Stopwatch point3 = new Stopwatch(point2.getStop());
        for (int n=0; n<1000000; n++) {
            for (int i = 0; i < 50000; i++) {
                a = a + 2;
            }
        }
        counter++;
        Stopwatch.point(point3.getStart(), System.nanoTime(), counter);
    }
}
