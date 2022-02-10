package com.javadevjournal.springbootresttemplate.service;

import com.javadevjournal.springbootresttemplate.model.Employee;
import com.javadevjournal.springbootresttemplate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;

  public List getAllEmployees() {
    List employees = new ArrayList();
    employeeRepository.findAll().forEach(employee -> employees.add(employee));
    return employees;
  }

  public Employee getEmployeeById(int id) {
    return employeeRepository.findById(id).get();
  }

  public void saveOrUpdate(Employee employee) {
    employeeRepository.save(employee);
  }

  public void delete(int id) {
    employeeRepository.deleteById(id);
  }
}
