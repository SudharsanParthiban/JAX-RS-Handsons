package com.newRestDemo.model;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

@Produces("application/json")
@XmlRootElement(name = "employee")
public class employee {
	private int id;
	private String name;
	private String dept;
	private String job;
	private double salary;
	
	
	public employee(int id, String name, String dept, String job, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", dept=" + dept + ", job=" + job + ", salary=" + salary + "]";
	}
	
	
	
	

}
