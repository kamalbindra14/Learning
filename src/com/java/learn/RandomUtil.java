package com.java.learn;

import java.util.Random;

/**
 * @author kamal.bindra
 *
 */
public class RandomUtil {

  /**
   * @param args
   */
  public static void main(String[] args) {
    int max = 5;
    int min = 2;
    Random rnd = new Random();
    int i = rnd.nextInt((max - min) + 1) + min;
    System.out.println("i = " + i);
  }

}
