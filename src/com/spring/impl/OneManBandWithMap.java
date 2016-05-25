package com.spring.impl;

import java.util.Map;
import com.spring.intf.Instrument;
import com.spring.intf.Performer;

public class OneManBandWithMap implements Performer {
  Map<String, Instrument> instruments;

  public OneManBandWithMap() {

  }

  @Override
  public void perform() {
    for (Map.Entry<String, Instrument> mapEntry : instruments.entrySet()) {
      System.out.println(mapEntry.getKey() + " : ");
      mapEntry.getValue().play();
    }
  }

  public void setInstruments(Map<String, Instrument> instruments) {
    this.instruments = instruments;
  }
}
