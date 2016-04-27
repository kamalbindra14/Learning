package com.hibernate.dao.impl;

import com.hibernate.bean.Employee;
import com.hibernate.dao.intf.EmployeeDao;

/**
 * @author kamal.bindra
 *
 */
public class EmployeeDaoImpl implements EmployeeDao {

  /*
   * (non-Javadoc)
   * 
   * @see com.hibernate.dao.intf.EmployeeDao#saveEmp(com.hibernate.bean.Employee)
   */
  @Override
  public void saveEmp(Employee e) {
    System.out.println("hiiiiiiii");
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.hibernate.dao.intf.EmployeeDao#updateEmp(com.hibernate.bean.Employee)
   */
  @Override
  public void updateEmp(Employee e) {

  }

  /*
   * (non-Javadoc)
   * 
   * @see com.hibernate.dao.intf.EmployeeDao#deleteEmp(com.hibernate.bean.Employee)
   */
  @Override
  public void deleteEmp(Employee e) {

  }

}
