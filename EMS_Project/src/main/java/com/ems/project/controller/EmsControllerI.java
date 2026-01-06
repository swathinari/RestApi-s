package com.ems.project.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ems.project.entity.EmsEntity;

public interface EmsControllerI {
	abstract ResponseEntity<EmsEntity> createEmp(EmsEntity emp);
	public List<EmsEntity> getEmp(EmsEntity emp);


}
