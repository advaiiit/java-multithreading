package com.example;

import static com.example.ThreadColor.ANSI_RED;

public class RunnableInterface {

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(ANSI_RED + "Method 2:\tImplementing Runnable Interface and Override the run() method");
        }
    }
}
