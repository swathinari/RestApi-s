package com.restApi.lms.entity;

import java.util.Date;

import com.restApi.lms.enums.roles.LmsRoles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table //(name="EmployeeEntity")
public class EmployeeEntity {
	
	@Column (nullable = false)
	private String name;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false)
	private String designation;
	
	private String address;
	
	@Column (nullable=false,unique = true)
	private String emailId;
	private Date doj;
	
	
	@Enumerated(EnumType.STRING)
	@Column (nullable = false)
	private LmsRoles role;
	
	@Column (nullable = false)
	private long managerId;
	
	@Column (nullable = false)
	private String managerName;
	
	
	

}
