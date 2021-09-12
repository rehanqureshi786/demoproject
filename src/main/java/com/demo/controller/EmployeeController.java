package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;


	@RequestMapping(value = "employees" ,method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getAllEmp() {
		return empService.getAllEmployee();
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		empService.save(emp);
		return emp;
	}
	
	
	@GetMapping("/employees/{id}")
	@ResponseBody
	public Employee getEmpById(@PathVariable int id) {
		System.out.println("I am in Get Method");	
		Employee e = empService.getEmpById(id);
		System.out.println("Email: "+e.getEmail());
		//return id;
		return empService.getEmpById(id);

	}
	
	
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		empService.update(emp);
	return emp;
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		empService.remove(id);
	}
	
	
	
	

}
