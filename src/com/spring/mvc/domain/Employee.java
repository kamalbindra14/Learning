package com.spring.mvc.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * @author kamal.bindra
 *
 */
@Component
public class Employee {
  private String firstName;
  private String lastName;
  private String department;
  private Date joinDate;
  private String salary;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Date getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

}
