package com.java.learn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class Learn {
  private static Properties prop = null;
  final static List<String> list = new ArrayList<String>();

  public static void main(String[] args) {
    String str = "    ";
    System.out.println("String Length : " + str.length());
    new UncheckedException().buggyMethod();
    // StaticNested st = new StaticNested();
    // NestedClass.StaticNested st1 = new NestedClass.StaticNested();
    Learn mc = new Learn();
    mc.set();
    System.out.println(prop.getProperty("1"));

    list.add("aaa");
    list.add("bbb");
    for (String s : list) {
      System.out.println(s);
    }
    // list reference variable is final not object
    // list = new ArrayList<String>();
    failFastSingleThreaded();
  }

  public void set() {
    prop = new Properties();
    try {
      prop.load(MainClass.class.getClassLoader().getResourceAsStream("application.properties"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void failFastSingleThreaded() {
    Map<String, String> hMap = new HashMap<String, String>();
    hMap.put("1", "ONE");
    hMap.put("2", "TWO");
    hMap.put("3", "THREE");

    Iterator<Map.Entry<String, String>> itr = hMap.entrySet().iterator();
    while (itr.hasNext()) {
      Map.Entry<String, String> entry = itr.next();
      // both put and remove throws ConcurrentModificationException
      // hMap.put("4", "Four");
      // if ("3".equalsIgnoreCase(entry.getKey())) {
      // hMap.remove("3");
      // }

      // fail safe in single threaded environment
      if ("3".equalsIgnoreCase(entry.getKey())) {
        itr.remove();
      }
    }
    iterateMap(hMap);
  }

  private static void failFastMultiThreaded() {

  }

  private static void iterateMap(Map<String, String> map) {
    Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
    while (itr.hasNext()) {
      Map.Entry<String, String> entry = itr.next();
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
