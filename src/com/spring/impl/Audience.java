/*
 * COPYRIGHT: Mahindra Comviva Technologies Pvt. Ltd.
 *
 * This software is the sole property of Comviva and is protected
 * by copyright law and international treaty provisions. Unauthorized
 * reproduction or redistribution of this program, or any portion of
 * it may result in severe civil and criminal penalties and will be
 * prosecuted to the maximum extent possible under the law.
 * Comviva reserves all rights not expressly granted. You may not
 * reverse engineer, decompile, or disassemble the software, except
 * and only to the extent that such activity is expressly permitted
 * by applicable law notwithstanding this limitation.

 * THIS SOFTWARE IS PROVIDED TO YOU "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE. YOU ASSUME THE ENTIRE RISK AS TO THE ACCURACY
 * AND THE USE OF THIS SOFTWARE. Comviva SHALL NOT BE LIABLE FOR
 * ANY DAMAGES WHATSOEVER ARISING OUT OF THE USE OF OR INABILITY TO
 * USE THIS SOFTWARE, EVEN IF Comviva HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
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
