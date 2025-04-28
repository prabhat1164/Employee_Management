package org.codingwallah.handsOn.service;

import org.codingwallah.handsOn.model.Employee;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);
    Employee readEmployee(Long id);
}
//abstract methods hai ye isliye body nhi hai