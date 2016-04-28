package com.spring.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.spring.intf.Logging;

/**
 * @author kamal.bindra
 *
 */
@Component("log")
@Aspect
public class LoggingAspect implements Logging {

  @Pointcut("execution(public * *(..))")
  public void performance() {

  }

  @Override
  @Before("performance()")
  public void applyLog(JoinPoint jp) {
    System.out.println("Executing : " + jp.getSignature().getName());
  }
}
