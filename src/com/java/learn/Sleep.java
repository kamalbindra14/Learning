package com.java.learn;

/**
 * @author kamal.bindra
 *
 */
public class Sleep {

  public void makeMeSleep() {
    try {
      System.out.println("Sleeping...........");
      Thread.sleep(10000);
      System.out.println("Got Awake...........");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
