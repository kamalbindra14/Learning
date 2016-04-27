package com.spring.impl;

import com.spring.intf.Instrument;

public class Guitar implements Instrument {
  public Guitar() {

  }

  @Override
  public void play() {
    System.out.println("TING TING TING");
  }

}
