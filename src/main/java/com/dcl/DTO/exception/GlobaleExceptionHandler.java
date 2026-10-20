package com.dcl.DTO.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dcl.DTO.allDto.ExceptionResponceDTO;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobaleExceptionHandler {
	
	
	@ExceptionHandler(DuplicateResourceException.class)
	public ResponseEntity<ExceptionResponceDTO> handlerDuplicateResourceException(DuplicateResourceException ex,HttpServletRequest request){
		
		ExceptionResponceDTO reaponse=new ExceptionResponceDTO(
				LocalDateTime.now(), 
				HttpStatus.CONFLICT.value(), 
				HttpStatus.CONFLICT.getReasonPhrase(), 
				ex.getMessage(), request.getRequestURI()) ;
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(reaponse);
			
			
		
		
	}

}
