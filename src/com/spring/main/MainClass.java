package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.intf.PassArgs;

public class MainClass {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext(
      "applicatonContext-servlet.xml");
    // PropertiesConfig conf = (PropertiesConfig) ctx.getBean("propertiesConfig");
    // System.out.println(conf.getItems());
    // Performer juggler = (Performer) ctx.getBean("juggler");
    // juggler.perform();
    // ((Contestent) juggler).receiveAward();

    PassArgs arg = (PassArgs) ctx.getBean("passArgsImpl");
    arg.arguments("I am passed as a string argument");

    // Performer poeticJuggler = (Performer) ctx.getBean("poeticJuggler");
    // poeticJuggler.perform();
    //
    // Performer instrumentalist = (Performer) ctx
    // .getBean("instrumentalist");
    // instrumentalist.perform();
    //
    // Performer kenny = (Performer) ctx.getBean("kenny");
    // kenny.perform();
    //
    // System.out.println("oneManBandList........");
    // Performer oneManBandList = (Performer) ctx.getBean("oneManBandList");
    // oneManBandList.perform();
    //
    // System.out.println("oneManBandSet.......");
    // Performer oneManBandSet = (Performer) ctx.getBean("oneManBandSet");
    // oneManBandSet.perform();
    //
    // System.out.println("oneManBandMap.......");
    // Performer oneManBandWithMap = (Performer) ctx
    // .getBean("oneManBandMap");
    // oneManBandWithMap.perform();

    // Thinker t = (Thinker) ctx.getBean("thinker");
    // t.thinkOfSomething("A Nice Thought........");
  }
}
