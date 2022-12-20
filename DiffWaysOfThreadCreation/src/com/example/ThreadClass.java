package com.example;

import static com.example.ThreadColor.ANSI_BLACK;

public class ThreadClass extends Thread {

    public void run() {
        System.out.println(ANSI_BLACK + "Method 1:\tCreating subclass of Thread and overriding run() method");
    }
}