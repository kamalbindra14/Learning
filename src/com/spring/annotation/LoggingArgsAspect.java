package com.spring.annotation;

import java.util.Arrays;

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
@Component
@Aspect
public class LoggingArgsAspect implements Logging {
  // not working due to &&
  // @Pointcut("execution(public * *(..))&& args(str)")
  @Pointcut("execution(public * *(..))and args(str)")
  public void logArgs() {

  }

  /*
   * (non-Javadoc)
   * 
   * @see com.spring.intf.Logging#applyLog(org.aspectj.lang.JoinPoint)
   */
  @Override
  @Before("logArgs()")
  public void applyLog(JoinPoint jp) {
    System.out.println("arguments passed to method : " + Arrays.toString(jp.getArgs()));
  }
}
