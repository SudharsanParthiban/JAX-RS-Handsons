package com.newRestDemo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.*;

import com.newRestDemo.model.employee;

@Path("/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeServiceImpl implements EmployeeService {
	static List<employee> Employee_list = new ArrayList<employee>();
	
	static {
		employee e1 = new employee(121, "Ajay", "development", "developer", 30000);
		Employee_list.add(e1);
		
		employee e2 = new employee(122, "Ragu", "Admin", "manager", 60000);
		Employee_list.add(e2);
		
		employee e3 = new employee(123, "Guru", "support", "techsupport", 20000);
		Employee_list.add(e3);
		
		employee e4 = new employee(124, "Sai", "development", "manager", 70000);
		Employee_list.add(e4);
	}
	
	
	
	@GET
	@Path("{id}")
	public employee getEmployee(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		employee val = null;
		for(employee obj : Employee_list) {
			if((obj.getId() == id)) {
				val = obj;
				break;
			}
		}
		
		return val;
	}
	@GET
	@Path("{dept}")
	public List<employee> getEmployee(@QueryParam("dept")String dept) {
		// TODO Auto-generated method stub
		List<employee> val = new ArrayList<employee>();
		for(employee obj : Employee_list) {
			if((obj.getDept()).equals(dept)) {
				val.add(obj);
			}
		}
		
		return val;
	}
	
	@GET
	@Path("/SalaryRange")
	public List<employee> getEmployee() {
		// TODO Auto-generated method stub
		List<employee> val = new ArrayList<employee>();
		for(employee obj : Employee_list) {
			if((obj.getSalary() >= 30000 && obj.getSalary() <= 70000)) {
				val.add(obj);
			}
		}
		
		return val;
	}
	
	@GET
	@Path("/Employees")
	public List<employee> getAllEmployees() {
		// TODO Auto-generated method stub

		return Employee_list;
	}
	
	

}
