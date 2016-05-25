package com.java.learn;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public MyServlet() {

  }

  public void doGet(HttpServletRequest reqest, HttpServletResponse reponse) {
    doPost(reqest, reponse);
  }

  public void doPost(HttpServletRequest reqest, HttpServletResponse reponse) {
    System.out.println("hiiiiiiiiiiiiii");
  }

  public void init() {

  }

}
