package com.hibernate.dao.intf;

import com.hibernate.bean.Employee;

/**
 * @author kamal.bindra
 *
 */
public interface EmployeeDao {
  void saveEmp(Employee e);

  void updateEmp(Employee e);

  void deleteEmp(Employee e);
}
