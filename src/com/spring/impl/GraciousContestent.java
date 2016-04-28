package com.spring.impl;

import com.spring.intf.Contestent;

/**
 * @author kamal.bindra
 *
 */
public class GraciousContestent implements Contestent {

  /*
   * (non-Javadoc)
   * 
   * @see com.spring.intf.Contestent#receiveAward()
   */
  @Override
  public void receiveAward() {
    System.out.println("Won a award for my efforts....");
  }
}
