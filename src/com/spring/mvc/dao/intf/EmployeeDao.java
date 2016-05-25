package com.spring.mvc.dao.intf;

import com.spring.mvc.domain.Employee;

/**
 * @author kamal.bindra
 *
 */
public interface EmployeeDao {
  void saveEmpDBDetails(Employee emp);
}
