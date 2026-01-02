package com.restApi.lms.service;


import com.restApi.lms.entity.EmployeeEntity;

public interface LmsServiceI {
	public EmployeeEntity createEmployee();
	public EmployeeEntity getEmployeeById();
	public EmployeeEntity getAllEmployees();
	
	

}
