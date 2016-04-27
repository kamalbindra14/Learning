package com.java.concurrency;

public class Task implements Runnable {
  @Override
  public void run() {
    System.out.println("Processing task : " + Thread.currentThread().getName());
  }
}
