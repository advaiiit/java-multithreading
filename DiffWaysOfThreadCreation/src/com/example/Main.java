package com.example;

import static com.example.ThreadColor.ANSI_BLUE;
import static com.example.ThreadColor.ANSI_GREEN;

public class Main {

    public static void main(String[] args) {

        ThreadClass thread1 = new ThreadClass();
        thread1.start();

        Thread thread2 = new Thread(new RunnableInterface.MyRunnable());
        thread2.start();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Method 3:\tImplementing Runnable from an Anonymous Class");
            }
        };

        Thread thread3 = new Thread(runnable1);
        thread3.start();

        Runnable runnable2 = () -> {
            System.out.println(ANSI_BLUE + "Method 4:\tImplementing Runnable from Lambda Expression");
        };

        Thread thread4 = new Thread(runnable2);
        thread4.start ();
    }
}
