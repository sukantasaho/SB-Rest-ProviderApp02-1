package com.main.services;

import java.util.List;

import com.main.entity.Doctor;

public interface IDoctorService 
{
      public List<Doctor> getAllDoctors();
      public String registerDoctor(Doctor doctor);
      public Doctor getDoctorById(Integer id);
}
