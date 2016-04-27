package com.java.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
  private BlockingQueue<Integer> sharedQueue = null;

  public Consumer(BlockingQueue<Integer> queue) {
    sharedQueue = queue;
  }

  @Override
  public void run() {
    while (true) {
      get();
    }
  }

  private void get() {
    synchronized (sharedQueue) {
      while (sharedQueue.isEmpty()) {
        System.out.println("Queue is Empty. So waiting in get()...");
        try {
          sharedQueue.wait();
        } catch (InterruptedException e) {
          System.out.println("InterruptedException while waiting in get()");
        }
      }
      System.out.println("Consumed : " + sharedQueue.poll());
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        System.out.println("InterruptedException while sleeping in put()");
      }
      sharedQueue.notify();
    }
  }
}
