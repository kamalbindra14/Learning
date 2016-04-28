package com.spring.intf;

import org.aspectj.lang.JoinPoint;

/**
 * @author kamal.bindra
 *
 */
public interface Logging {
  void applyLog(JoinPoint jp);
}
