package com.java.learn;

public class UncheckedException {

  public void buggyMethod() {
    try {
      throw new NullPointerException();
    } catch (RuntimeException e) {
      System.out.println("Runtime Exception so safely returning ----> " + e);
      return;
    }
  }

}
