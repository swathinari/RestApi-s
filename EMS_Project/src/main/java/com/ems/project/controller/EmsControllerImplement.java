package com.ems.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.project.entity.EmsEntity;
import com.ems.project.repository.EmsRepository;

@RestController
@RequestMapping("/ems")
public class EmsControllerImplement implements EmsControllerI {
	
	@Autowired
	private EmsRepository emsRepo;
	
	@PostMapping("/emp") //create a employee data
	public ResponseEntity<EmsEntity> createEmp(@RequestBody EmsEntity emp){		
		EmsEntity saveData=emsRepo.save(emp);
		return ResponseEntity.ok(saveData);
	}

	@GetMapping("employees") //Get all the employees
	public List<EmsEntity> getEmp(EmsEntity emp) {
		List<EmsEntity> getAllEmp=emsRepo.findAll();
		return getAllEmp;
	}
	



	
	

}
