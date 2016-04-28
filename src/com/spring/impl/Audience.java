package com.spring.impl;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author kamal.bindra
 *
 */
public class Audience {
  public Audience() {
    super();
  }

  public void takeSeats() {
    System.out.println("Audience is taking their seats.....");
  }

  public void switchOffCells() {
    System.out.println("Audience is switching their cell phones..");
  }

  public void applaud() {
    System.out.println("Clap Clap Clap Clap Clap....");
  }

  public void refund() {
    System.out.println("Bad Performance....Want money back...");
  }

  public void watchPerformance(ProceedingJoinPoint jp) {
    try {
      System.out.println("Audience is taking their seats to watch performance.....");
      System.out.println("Audience is switching their cell phonesto watch performance....");
      long start = System.currentTimeMillis();
      jp.proceed();
      long end = System.currentTimeMillis();
      System.out.println("Performance took " + (end - start) + " milliseconds...");
      System.out.println("Nice Performance........");
    } catch (Throwable e) {
      System.out.println("Bad Performance....Want money back...");
    }
  }

}
