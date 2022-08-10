package com.newRestDemo.DAO;

import java.util.ArrayList;
import java.util.List;

import com.newRestDemo.model.employee;

public interface EmployeeDAO {
	
	public employee getEmployee(int id);
	
	public employee getEmployee(String dept);
	
	public employee getEmployee(double salary);
	
	public List<employee> getAllEmployees();

}
