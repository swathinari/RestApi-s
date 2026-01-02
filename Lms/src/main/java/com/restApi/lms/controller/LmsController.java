package com.restApi.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.lms.entity.EmployeeEntity;
import com.restApi.lms.repos.LmsRepos;

@RestController //(combo of 2 annotations=> 1.response body=>return the data in json format 2.controller=> handles the api request)
@RequestMapping("/lms")
public class LmsController {
	@Autowired
	private LmsRepos lmsRepos;
	
	@PostMapping("/emp")
	public ResponseEntity<EmployeeEntity> createEmpl(@RequestBody EmployeeEntity empEntity){
		EmployeeEntity empData= lmsRepos.save(empEntity);
		return ResponseEntity.ok(empData);
		
	}
	

}
