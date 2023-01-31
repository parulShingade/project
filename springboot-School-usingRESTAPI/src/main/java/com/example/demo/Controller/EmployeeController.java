package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@PostMapping("/post")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	//getallEmployee
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
//	return employeeService.getAllEmployess();
		System.out.println("test");
		return employeeRepo.findAll();
	}
	//getEmployee by id
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById( @PathVariable("id") long EmployeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(EmployeeId), HttpStatus.OK);
	}

}
