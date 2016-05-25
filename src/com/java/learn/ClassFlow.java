package com.java.learn;

public class ClassFlow {
  int a = 5;
  final String str = "Final string";
  static String s = "static string";

  public ClassFlow() {
    meth();
  }

  static {
    System.out.println("static block...");
  }

  {
    System.out.println("Non-static block......");
  }

  public void nonStaticMeth() {
    System.out.println("Non-static method....");
  }

  public static void staticMeth() {
    System.out.println("Static method....");
  }

  private static void meth() {
    System.out.println("hiiiiiiiiiiiii");
  }

  public static void main(String[] args) {
    ClassFlow cf = new ClassFlow();
    ClassFlow cf1 = new ClassFlow();
  }
}
