package com.SpringBootEx1.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootEx1.Entity.Employee;
import com.SpringBootEx1.Repository.EmployeeRepository;

@Service
public class EmployeeService 
{	
	@Autowired
	private EmployeeRepository employeeRepository;

	private List<Employee> emp = new ArrayList<Employee>(Arrays.asList(
			new Employee("E1","Mahesh","IT"),
			new Employee("E2","Anil","IT"), 
			new Employee("E3", "Johny","IT")));
	
	public List<Employee> getEmployees() 
	{	
		employeeRepository.findAll().forEach(emp::add);
		return emp;
	}

	public Employee getEmployees(String id) 
    {	
	   return employeeRepository.findOne(id);
    }

	public Employee postEmployees(Employee ep) 
	{		
		return employeeRepository.save(ep);
	}

	public Employee putEmployees(String id, Employee ep) {
		return employeeRepository.save(ep);
	}

	public void deleteEmployee(String id) {
		employeeRepository.delete(id);
	}

}
