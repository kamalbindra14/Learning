package com.spring.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import com.spring.impl.GraciousContestent;
import com.spring.intf.Contestent;

/**
 * @author kamal.bindra
 *
 */
@Aspect
@Component
public class ContestentIntroducer {
  @DeclareParents(value = "com.spring.intf.Performer+", defaultImpl = GraciousContestent.class)
  private Contestent contestent;
}
