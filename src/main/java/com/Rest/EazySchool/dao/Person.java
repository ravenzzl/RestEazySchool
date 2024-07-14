package com.Rest.EazySchool.dao;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	@GenericGenerator(strategy = "native",name = "native")
	private Long personId;
	private String Name;
	@Column(name = "mobile_number")
	private String MobileNumber;
	private String email;
	private String password;

}
