package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.demo.model.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getAllEmployee();

	public void save(Employee employee);

	public Employee update(Employee employee);

	public void remove(int id);
	
	public Employee getEmpById(int id);
}
