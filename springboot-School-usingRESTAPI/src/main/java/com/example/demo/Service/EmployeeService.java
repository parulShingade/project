package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Employee;

public interface EmployeeService {

	
		Employee saveEmployee(Employee employee);
		
		List<Employee> getAllEmployess();
	
		
		Employee getEmployeeById(long id);
		
		
}
