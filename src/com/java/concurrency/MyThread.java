package com.java.concurrency;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("Processing task : " + getName());
  }
}
