package com.company;

import java.io.*;

public class Stopwatch {
    public static long T;

    public Stopwatch() {
        T = System.nanoTime();
    }

    public Stopwatch(long a) {
        T = a;
    }

    public static void point (String name) {
        String text = name + " исполнялся " + ((System.nanoTime() - T)/1000000000) + " сек. ";
        T = System.nanoTime();
        file(text);
    }

    public long getT() {
        return T;
    }

    public void setT(long a) {
        T = a;
    }

    public static void file(String text) {
        T = System.nanoTime();
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
