package com.spring.impl;

import com.spring.intf.Poem;

public class PoeticJuggler extends Juggler {
  private Poem poem;

  public PoeticJuggler(int items, Poem poem) {
    super(items);
    this.poem = poem;
  }

  public void perform() {
    super.perform();
    System.out.println("While reciting.......");
    poem.recite();
  }
}
