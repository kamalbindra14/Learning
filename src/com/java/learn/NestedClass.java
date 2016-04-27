package com.java.learn;

public class NestedClass {
  private int x = 1;
  private static int y = 2;

  class Inner {
    private int x = 3;

    void showInner() {
      System.out.println("showInner()....");
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      System.out.println("outer x = " + NestedClass.this.x);
    }
  }

  private static class StaticNested {
    private int l = 6;
    private static int m = 7;
    private static int y = 8;

    private void showStaticNested() {
      System.out.println("showStaticNested()....");
      System.out.println("l = " + l);
      System.out.println("m = " + m);
      System.out.println("x = " + new NestedClass().x);
      System.out.println("y = " + y);
      System.out.println("outer y = " + NestedClass.y);
      // using any other class
      // new ClassFlow();
    }
  }

  public static void main(String[] args) {
    StaticNested st = new StaticNested();
    NestedClass.StaticNested st1 = new NestedClass.StaticNested();
    System.out.println("Main.......");
    System.out.println("Static Nested inside Main.....");
    System.out.println("l = " + st1.l);
    System.out.println("m = " + StaticNested.m);
    st.showStaticNested();
    System.out.println("Inner inside Main...");
    NestedClass.Inner innerObj = new NestedClass().new Inner();
    innerObj.showInner();
    System.out.println("inner x = " + innerObj.x);
    System.out.println("own y = " + y);
    System.out.println("StaticNested y = " + StaticNested.y);

  }

}
