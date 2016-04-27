package com.spring.impl;

import com.spring.intf.Instrument;

public class Saxophone implements Instrument {
  public Saxophone() {

  }

  @Override
  public void play() {
    System.out.println("PLING PLING PLING");
  }

}
