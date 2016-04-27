package com.java.concurrency;

public class MainThread {
  public static final int SIZE = 5;

  public static void main(String[] args) {
    // BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(SIZE);
    // Producer in = new Producer(sharedQueue);
    // Consumer out = new Consumer(sharedQueue);
    // Thread t1 = new Thread(in);
    // Thread t2 = new Thread(out);
    // t2.start();
    // t1.start();
    ThreadPool threadPool = new ThreadPool(2, 5);
    for (int i = 0; i < 5; i++) {
      threadPool.process(new Thread(new Task()));
    }
    threadPool.shutDown();
  }
}
