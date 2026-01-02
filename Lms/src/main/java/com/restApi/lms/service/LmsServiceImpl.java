package com.restApi.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restApi.lms.entity.EmployeeEntity;
//import com.restApi.lms.repos.LmsRepos;

@Service
public class LmsServiceImpl implements LmsServiceI {
	@Autowired
	//private LmsRepos lmsRepos;

	@Override
	public EmployeeEntity createEmployee() {
		
		return null;
	}

	@Override
	public EmployeeEntity getEmployeeById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeEntity getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
