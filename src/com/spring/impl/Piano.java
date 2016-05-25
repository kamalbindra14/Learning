package com.spring.impl;

import com.spring.intf.Instrument;

public class Piano implements Instrument {
  public Piano() {

  }

  @Override
  public void play() {
    System.out.println("PING PING PING");
  }

}
