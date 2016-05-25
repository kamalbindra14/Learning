package com.java.learn;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.java.concurrency.MyThread;
import com.java.concurrency.Task;

public class MainClass {
  static final Map<Integer, String> intmap = new TreeMap<Integer, String>();
  static final Map<String, String> strmap = new TreeMap<String, String>();

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
    // sl.makeMeSleep();

    intmap.put(1, "one");
    intmap.put(5, "five");
    intmap.put(2, "two");
    intmap.put(4, "four");
    intmap.put(14, "fourteen");
    intmap.put(10, "ten");
    intmap.put(13, "thirteen");
    intmap.put(3, "three");
    for (Map.Entry<Integer, String> entry : intmap.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
    System.out.println("======================");
    strmap.put("1", "one");
    strmap.put("5", "five");
    strmap.put("2", "two");
    strmap.put("4", "four");
    strmap.put("14", "fourteen");
    strmap.put("10", "ten");
    strmap.put("13", "thirteen");
    strmap.put("3", "three");
    for (Map.Entry<String, String> entry : strmap.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
  }
}
