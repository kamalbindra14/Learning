package com.spring.impl;

import com.spring.intf.Poem;

public class Sonnet29 implements Poem {
  private static final String LINES = "Shakespeare's Sonnet29 Poem";

  public Sonnet29() {

  }

  @Override
  public void recite() {
    System.out.println(LINES);
  }
}
