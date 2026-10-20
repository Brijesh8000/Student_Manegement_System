package com.dcl.DTO.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.DTO.allDto.CreateStudentRequestDto;
import com.dcl.DTO.allDto.StudentResponseDto;
import com.dcl.DTO.entity.Student;
import com.dcl.DTO.exception.DuplicateResourceException;
import com.dcl.DTO.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public StudentResponseDto addStudent(CreateStudentRequestDto s) {
		
		Student student =mapToEntity(s);
		if(emailExist(student.getEmail())) {
		
			throw new DuplicateResourceException(student.getEmail()+"email already Exist ");
		}
		Student s1=studentRepository.save(student);
		
		return mapToStudentResponse(student);
		
	}
	public Boolean emailExist(String email) {
		Boolean b=studentRepository.existsByEmail(email);
		return b;
	}
	public StudentResponseDto mapToStudentResponse(Student s1) {
		StudentResponseDto studentResponse=new StudentResponseDto();
		studentResponse.setName(s1.getName());
		studentResponse.setAge(s1.getAge());
		studentResponse.setEmail(s1.getEmail());
		studentResponse.setPhone(s1.getPhone());
		studentResponse.setRollNo(s1.getRollNo());
		studentResponse.setSubject(s1.getSubject());
		studentResponse.setCreatedDate(s1.getCreatedDate());
		studentResponse.setCreatedTime(s1.getCreatedTime());
		
		return studentResponse;
		
	}
	
	
	public Student mapToEntity(CreateStudentRequestDto s) {
		Student student=new Student();
		
		student.setName(s.getName());
		student.setEmail(s.getEmail());
		student.setAge(s.getAge());
		student.setPhone(s.getPhone());
		student.setRollNo(s.getRollNo());
		student.setSubject(s.getSubject());
		student.setDeleted(false);
		student.setCreatedDate(LocalDate.now());
		student.setCreatedTime(LocalTime.now());
		
		student.setUpdatedAt(LocalDateTime.now());
		
		
		
		return student;
	}
	
	

}
