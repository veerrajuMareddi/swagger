package net.javaguides.springboot.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Error2;
import net.javaguides.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
    
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	// build create employee REST API
	@PostMapping()
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee)throws Exception
	{	
		try {
			
		return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.OK);
		
	    	} 
		
		catch(Exception e)
		{
	    return new ResponseEntity<>( new Error2("hi",e.getMessage(),null), HttpStatus.NOT_FOUND);
		}
	}
	
	// build get all employees REST API
	@GetMapping
	@ApiOperation(value="This is for getting employee by id",
	notes="you will get directly from rest db about employee",
	produces="json",
	response=Employee.class)
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	// build get employee by id REST API
	// http://localhost:8080/api/employees/1
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
	}
	
	// build update employee REST API
	// http://localhost:8080/api/employees/1
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id
												  ,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}
	
	// build delete employee REST API
	// http://localhost:8080/api/employees/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
		
		// delete employee from DB
		employeeService.deleteEmployee(id);
		
		return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
	}
	
}
