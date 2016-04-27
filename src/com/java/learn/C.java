package com.java.learn;

public class C {
  public void methodC() {
    // A.list.add(2);
    new A().list.add(2);
    System.out.println("list size in C :" + A.list.size());
  }
}
