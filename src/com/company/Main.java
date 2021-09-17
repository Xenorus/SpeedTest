package com.company;

import java.io.FileWriter;
import java.io.IOException;

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
        String res1 = stopwatch(start, stop, 1);

        a=0;
        start = System.nanoTime();
        for (int n=0; n<100000; n++) {
            for (int i = 0; i < 900000; i++) {
                a = a + 2;
            }
        }
        stop = System.nanoTime();
        String res2 = stopwatch(start, stop, 2);

        a=0;
        start = System.nanoTime();
        for (int n=0; n<1000000; n++) {
            for (int i = 0; i < 50000; i++) {
                a = a + 2;
            }
        }
        stop = System.nanoTime();
        String res3 = stopwatch(start, stop, 3);


        //запись в файл
        try(FileWriter writer = new FileWriter("result.txt", false))
        {
            writer.write(res1);
            writer.write(res2);
            writer.write(res3);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static String stopwatch (long start, long stop, int number) {
        return ("Цикл " + number + " исполнялся " + ((stop - start)/1000000000) + " сек. ");
    }
}
