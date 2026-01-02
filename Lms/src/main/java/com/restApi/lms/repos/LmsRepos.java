package com.restApi.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restApi.lms.entity.EmployeeEntity;

public interface LmsRepos extends JpaRepository<EmployeeEntity, Long> {

}
