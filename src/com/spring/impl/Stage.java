package com.spring.impl;

public class Stage {
  private Stage() {

  }

  private static class SingleStage {
    static Stage instance = new Stage();
  }

  public static Stage getInstance() {
    return SingleStage.instance;
  }
}
