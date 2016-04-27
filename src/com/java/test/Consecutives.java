package com.java.test;

import java.util.Scanner;

public class Consecutives {
  public static void main(String args[]) {
    int i, min;
    int[] card = new int[3];
    String s;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter String"); // taking input
    s = in.nextLine();
    // splitting the string
    String[] newstring = s.split(":");
    // Setting default values for A,J,Q,K
    for (i = 0; i < 3; i++) {
      if (newstring[i].equals("A"))
        card[i] = 1;
      else if (newstring[i].equals("J"))
        card[i] = 11;
      else if (newstring[i].equals("Q"))
        card[i] = 12;
      else if (newstring[i].equals("K"))
        card[i] = 13;
      else
        card[i] = Integer.parseInt(newstring[i]);
    }
    // calculating minimum among all the three numbers
    min = Math.min(card[0], Math.min(card[1], card[2]));

    // if (min == card[0])
    // min = card[0];
    // else if (min == card[1])
    // min = card[1];
    // else
    // min = card[2];
    // Setting default consecutiveness
    if (card[0] == 12 && card[1] == 13 && card[2] == 1)
      System.out.println("true");
    // else if (card[0] == 13 && card[1] == 1 && card[2] == 2)
    // System.out.println("true");
    else if (min + 1 == card[1] || min + 1 == card[2] || min + 1 == card[0]) {
      if (min + 2 == card[1] || min + 2 == card[2] || min + 2 == card[0]) {
        System.out.println("true");
      } else
        System.out.println("false");
    } else
      System.out.println("false");

    in.close();

  }
}
