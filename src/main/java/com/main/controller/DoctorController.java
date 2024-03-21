package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Doctor;
import com.main.services.IDoctorService;
 
 

@RestController
@RequestMapping("/api")
public class DoctorController 
{

	@Autowired
	private IDoctorService service;
    
	@GetMapping("/getAllDoctors")
	public ResponseEntity<List<Doctor>> getAllDoctors()
	{
		   List<Doctor> dList = service.getAllDoctors();
		   
		return new ResponseEntity<List<Doctor>>(dList,HttpStatus.OK);
	}

	 
	@PostMapping("/register")
	public ResponseEntity<String> registerDoctor(@RequestBody Doctor doctor) 
	{
		String msg = service.registerDoctor(doctor);
		
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	 
}
