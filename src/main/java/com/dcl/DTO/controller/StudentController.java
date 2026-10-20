package com.dcl.DTO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcl.DTO.allDto.CreateStudentRequestDto;
import com.dcl.DTO.allDto.StudentResponseDto;
import com.dcl.DTO.entity.Student;
import com.dcl.DTO.service.StudentService;

@RestController
@RequestMapping("/api/students/")
public class StudentController {
	 @Autowired
	private StudentService studentService;
	
	@PostMapping
	public StudentResponseDto createStudent(@RequestBody CreateStudentRequestDto studentRequest) {
		StudentResponseDto student=studentService.addStudent(studentRequest);
		return student;
		
	}
	

}
