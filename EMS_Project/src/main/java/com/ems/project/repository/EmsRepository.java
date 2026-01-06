package com.ems.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.project.entity.EmsEntity;

public interface EmsRepository extends JpaRepository<EmsEntity, Long> {

}
