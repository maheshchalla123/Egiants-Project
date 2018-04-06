package com.SpringBootEx1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootEx1.Entity.Employee;
import com.SpringBootEx1.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService e;
	
	
	@RequestMapping(value="/employees", method=RequestMethod.GET, produces = {"application/xml","application/json"})
	@ResponseStatus(HttpStatus.OK)
	public  @ResponseBody List<Employee> getAllTopics()
	{
		return e.getEmployees();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee getTopic(@PathVariable String id)
	{
		return e.getEmployees(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public List<Employee> postATopic(@RequestBody Employee ep)
	{
		e.postEmployees(ep);	
		return e.getEmployees();
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
	public void putATopic(@RequestBody Employee ep,@PathVariable String id)
	{
		 e.putEmployees(id,ep);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
	public void deleteATopic(@PathVariable String id)
	{
		e.deleteEmployee(id);		
	}	

}
