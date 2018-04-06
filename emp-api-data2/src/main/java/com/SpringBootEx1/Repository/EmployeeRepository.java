package com.SpringBootEx1.Repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootEx1.Entity.Employee;


public interface EmployeeRepository extends CrudRepository<Employee ,String>
{
	

}
