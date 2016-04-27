package com.java.learn;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Singleton {
  private static Singleton instance = null;
  private Properties prop = null;

  private Singleton() {

  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public void loadProperties() {
    InputStream in = null;
    try {
      in = Singleton.class.getClassLoader().getResourceAsStream("application.properties");
      prop = new Properties();
      prop.load(in);
    } catch (IOException e) {
    }
  }
}
