package com.company;

import java.io.*;

public class Stopwatch {
    public static long start;
    public static long stop;

    public Stopwatch() {
        start = System.nanoTime();
    }

    public Stopwatch(long a) {
        start = a;
    }

    public static void point (long start, long a, int number) {
        stop = a;
        long time = (stop - start)/1000000000;
        String text = "Т" + number + " исполнялся " + time + " сек. ";
        file(text);
    }

    public long getStart() {
        return start;
    }

    public long getStop() {
        return stop;
    }

    public void setStart(long a) {
        start = a;
    }
    public void setStop(long a) {
        stop = a;
    }

    public static void file(String text) {
        File file = new File("result.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            String lineSeparator = System.getProperty("line.separator");
            writer.write(text + lineSeparator);
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

}
