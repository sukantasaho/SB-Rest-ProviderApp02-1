package com.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Doctor;
import com.main.repository.DoctorRepo;

@Service("dService")
public class DoctorServiceImp implements IDoctorService
{
     
	@Autowired
	private DoctorRepo repo;
	
	@Override
	public List<Doctor> getAllDoctors()
	{
		 
		return repo.findAll();
	}

	@Override
	public String registerDoctor(Doctor doctor) 
	{
		 
		return repo.save(doctor).getDocId()+" record is insertd";
	}

	@Override
	public Doctor getDoctorById(Integer id)
	{
		    Optional<Doctor> op = repo.findById(id);
		    Doctor d = null;
		    if(op.isPresent())
		    {
		    	d = op.get();
		    }
		return d;
	}

}
