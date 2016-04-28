package com.spring.impl;

import com.spring.intf.Thinker;

/**
 * @author kamal.bindra
 *
 */
public class Volunteer implements Thinker {
  @Override
  public void thinkOfSomething(String s) {
    System.out.println("Thinking...." + s);
  }
}
