package com.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.annotation.PropertiesConfig;
import com.spring.intf.Performer;

@Component("juggler")
public class Juggler implements Performer {
  // @Value("${juggler.items}")
  private int items;
  @Autowired
  private PropertiesConfig propertiesConfig;

  public Juggler() {

  }

  public Juggler(int items) {
    this.items = items;
  }

  @Override
  public void perform() {
    if (items == 0) {
      items = Integer.parseInt(propertiesConfig.getItems());
    }
    System.out.println("Juggles " + items + " items.");
  }

}
