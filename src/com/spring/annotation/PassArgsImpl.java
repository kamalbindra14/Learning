package com.spring.annotation;

import org.springframework.stereotype.Component;

import com.spring.intf.PassArgs;

/**
 * @author kamal.bindra
 *
 */
@Component
public class PassArgsImpl implements PassArgs {

  /*
   * (non-Javadoc)
   * 
   * @see com.spring.intf.PassArgs#arguments(java.lang.String)
   */
  @Override
  public void arguments(String str) {
    // TODO Auto-generated method stub
  }
}
