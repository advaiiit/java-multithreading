package com.example;

import java.util.concurrent.Callable;

public class CallableSum implements Callable<Integer> {

  private int input;
  public CallableSum(int input) {
    super();
    this.input = input;
  }

  @Override
  public Integer call() throws Exception {
    Thread.sleep(1000);
    int sum = 0;
    for (int i = 1; i < input; i++) {
      sum += i;
    }
    return sum;
  }
}
