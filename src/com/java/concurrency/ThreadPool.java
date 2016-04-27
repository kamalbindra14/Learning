/*
 * COPYRIGHT: Mahindra Comviva Technologies Pvt. Ltd.
 *
 * This software is the sole property of Comviva and is protected
 * by copyright law and international treaty provisions. Unauthorized
 * reproduction or redistribution of this program, or any portion of
 * it may result in severe civil and criminal penalties and will be
 * prosecuted to the maximum extent possible under the law.
 * Comviva reserves all rights not expressly granted. You may not
 * reverse engineer, decompile, or disassemble the software, except
 * and only to the extent that such activity is expressly permitted
 * by applicable law notwithstanding this limitation.

 * THIS SOFTWARE IS PROVIDED TO YOU "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE. YOU ASSUME THE ENTIRE RISK AS TO THE ACCURACY
 * AND THE USE OF THIS SOFTWARE. Comviva SHALL NOT BE LIABLE FOR
 * ANY DAMAGES WHATSOEVER ARISING OUT OF THE USE OF OR INABILITY TO
 * USE THIS SOFTWARE, EVEN IF Comviva HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
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
