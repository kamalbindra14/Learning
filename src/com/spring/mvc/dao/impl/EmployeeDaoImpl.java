package com.spring.mvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.spring.mvc.dao.intf.EmployeeDao;
import com.spring.mvc.domain.Employee;

/**
 * @author kamal.bindra
 *
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

  /*
   * (non-Javadoc)
   * 
   * @see com.spring.mvc.dao.intf.EmployeeDao#saveEmpDBDetails(com.spring.mvc.domain.Employee)
   */
  @Override
  public void saveEmpDBDetails(Employee emp) {
    System.out.println("Saved in DB.........");
  }

}
