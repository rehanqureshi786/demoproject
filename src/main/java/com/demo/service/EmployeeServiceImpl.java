package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		 empDao.save(employee);
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return empDao.save(employee);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		empDao.deleteById(id);
	}
	
	@Override 
	public Employee getEmpById(int id)
	{
		Employee employee=null;
	
		for(Employee emp:empDao.findAll())
		{
			if(emp.getEid()==id)
			{
				employee=emp;
				break;
			}
		}
		return employee;
	}

}
