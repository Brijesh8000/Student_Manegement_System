package com.dcl.DTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.DTO.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    Boolean existsByEmail(String eail);

	
}
