package com.java.concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTestWithMultiThread {
  // one way to protect shared list object
  // static final List<Integer> list = Collections.synchronizedList(new
  // ArrayList<Integer>());
  static final List<Integer> list = new ArrayList<Integer>();

  public static void main(String[] args) {

    new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 1; i <= 100; i++) {
          synchronized (list) {
            list.add(Integer.valueOf(i));
          }
        }
        System.out.println("List size at thread 0 : " + list.size());
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 101; i <= 200; i++) {
          synchronized (list) {
            list.add(Integer.valueOf(i));
          }
        }
        System.out.println("List size at thread 1 : " + list.size());
      }
    }).start();
  }
}
