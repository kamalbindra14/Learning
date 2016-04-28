package com.spring.impl;

import com.spring.intf.Interceptor;

/**
 * @author kamal.bindra
 *
 */
public class Magician implements Interceptor {

  @Override
  public void interceptThoughts(String t1) {
    System.out.println("Intercepted : " + t1);
  }

}
