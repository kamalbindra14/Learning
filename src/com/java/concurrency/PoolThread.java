package com.java.concurrency;

import java.util.concurrent.BlockingQueue;

/**
 * @author kamal.bindra
 *
 */
public class PoolThread extends Thread {
  private boolean stopped = false;
  private BlockingQueue<Runnable> taskQueue = null;

  public PoolThread(BlockingQueue<Runnable> taskQueue) {
    this.taskQueue = taskQueue;
  }

  @Override
  public void run() {
    Runnable task = null;
    while (!isStopped()) {
      try {
        task = this.taskQueue.take();
        task.run();
      } catch (InterruptedException e) {
        System.out.println("Interrupted from waiting in taskQueue for take()" + e);
      }
    }
  }

  public void doStop() {
    stopped = true;
    this.interrupt();
  }

  public boolean isStopped() {
    return stopped;
  }
}
