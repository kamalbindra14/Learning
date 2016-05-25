package com.spring.impl;

import java.util.Collection;

import com.spring.intf.Instrument;
import com.spring.intf.Performer;

public class OneManBand implements Performer {
  private Collection<Instrument> multipleInstrument;

  public OneManBand() {

  }

  @Override
  public void perform() {
    for (Instrument ins : multipleInstrument) {
      System.out.println("Playing......");
      ins.play();
    }
  }

  public void setMultipleInstrument(Collection<Instrument> multipleInstrument) {
    this.multipleInstrument = multipleInstrument;
  }

}
