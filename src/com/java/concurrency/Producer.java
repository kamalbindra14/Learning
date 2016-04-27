package com.java.concurrency;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
  private BlockingQueue<Integer> sharedQueue = null;
  private final Scanner input = new Scanner(System.in);

  public Producer(BlockingQueue<Integer> queue) {
    sharedQueue = queue;
  }

  @Override
  public void run() {
    int val;
    while (true) {
      System.out.println("Enter Integer only : ");
      val = input.nextInt();
      put(val);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println("InterruptedException while sleeping in put()");
      }
    }
  }

  private void put(int i) {
    synchronized (sharedQueue) {
      while (sharedQueue.size() == MainThread.SIZE) {
        System.out.println("Queue if full. So waiting in put()...");
        try {
          sharedQueue.wait();
        } catch (InterruptedException e) {
          System.out.println("InterruptedException while waiting in put()");
        }
      }
      sharedQueue.add(i);
      sharedQueue.notify();
    }
  }
}
