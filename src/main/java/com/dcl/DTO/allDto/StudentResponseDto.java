package com.dcl.DTO.allDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StudentResponseDto {
	
	private String name;
	private int age;
	private String email;
	private Long phone;
	private String subject;
	private int rollNo;
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	private LocalDate createdDate;
	private LocalTime createdTime;
	public LocalTime getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(LocalTime createdTime) {
		this.createdTime = createdTime;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	

}
