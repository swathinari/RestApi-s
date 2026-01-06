package com.ems.project.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="ems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmsEntity {
	String empName;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (unique=true, nullable=false)
	Long empId;
	@Column (unique=true, nullable=false)
	String emailId;
	@Column (nullable=false)
	String depart;
	@Column (nullable=false)
	Date doj;
	@Column (nullable=false)
	long age;
	@Column (nullable=false)
	double salary;

}
