package com.spring.impl;

import com.spring.intf.Instrument;
import com.spring.intf.Performer;

public class Instrumentalist implements Performer {
  private Instrument instrument;
  private String song;

  public Instrumentalist() {

  }

  @Override
  public void perform() {
    System.out.println("Playing " + song);
    instrument.play();
  }

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  public void setSong(String song) {
    this.song = song;
  }

}
