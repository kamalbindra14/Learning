package com.java.learn;

import java.util.Iterator;

import com.java.concurrency.MyThread;
import com.java.concurrency.Task;

public class MainClass {

  public static void main(String[] args) {
    System.out.println("main : " + Thread.currentThread().getName());
    // using Thread subclass
    MyThread t = new MyThread();
    t.start();
    // using Runnable
    Thread t1 = new Thread(new Task());
    // t1.setName("Runnable");
    // t1.start();

    // Integer.parseInt("9234324346");
    String s = "InvalidRequest Welcome 1.Sizzling Bipasha @ Rs8 2.Stunning Anushka @ Rs 8 3.Charming Sonam @ Rs 8 4.Striking Priyanka @ Rs8 5.Dazzling Kareena @ Rs 8 0 more ";

    System.out.println("len=" + s.length());
    new B().methodB();
    new C().methodC();
    Iterator<Integer> itr = A.list.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    String str = "C1|C2|C3";
    String[] s1 = str.split("\\|");
    String s2 = " ";
    System.out.println("l=" + s2.length());
    String res = "fnds {0} fksldf";
    res = res.replace("{0}", "1");
    System.out.println("res = " + res);
    Sleep sl = new Sleep();
    sl.makeMeSleep();
  }
}
