package com.newRestDemo.DAO;

import java.util.List;

import com.newRestDemo.model.employee;

public interface EmployeeService {
	
	public employee getEmployee(int id);
	
	public List<employee> getEmployee(String dept);
	
	public List<employee> getEmployee();
	
	public List<employee> getAllEmployees();

}
