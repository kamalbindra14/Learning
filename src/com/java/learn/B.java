package com.java.learn;

public class B {
  public void methodB() {
    // A.list.add(1);
    new A().list.add(1);
    System.out.println("list size in B :" + A.list.size());
  }
}
