package com.java.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author kamal.bindra
 *
 */
public class ThreadPool {
  private boolean stopped = false;
  private BlockingQueue<Runnable> taskQueue = null;
  private final List<PoolThread> workerThreads = new ArrayList<PoolThread>();

  public ThreadPool(int noOfThreads, int maxNoOfTasks) {
    taskQueue = new LinkedBlockingQueue<Runnable>(maxNoOfTasks);
    for (int i = 0; i < noOfThreads; i++) {
      workerThreads.add(new PoolThread(taskQueue));
    }
    for (PoolThread t : workerThreads) {
      t.start();
    }
  }

  public synchronized void process(Runnable task) {
    if (stopped) {
      throw new IllegalStateException("Thread Pool is shutdown.");
    }
    try {
      taskQueue.put(task);
    } catch (InterruptedException e) {
      System.out.println("InterruptedException while wating to be put in taskQueue" + e);
    }
  }

  public synchronized void shutDown() {
    stopped = true;
    for (PoolThread t : workerThreads) {
      t.doStop();
    }
  }
}
