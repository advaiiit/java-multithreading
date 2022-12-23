package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    ExecutorService executorService = Executors.newFixedThreadPool(10);
    List<Future<Integer>> list = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      Future<Integer> future = executorService.submit(new CallableSum(i));
      list.add(future);
    }

    for (Future future : list) {
      System.out.println(future.get());
    }
  }
}