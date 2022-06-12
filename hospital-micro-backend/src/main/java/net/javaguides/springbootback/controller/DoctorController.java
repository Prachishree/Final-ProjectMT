package net.javaguides.springbootback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springbootback.model.Doctor;
import net.javaguides.springbootback.repository.DoctorRepository;

@RestController
@RequestMapping("/api/v1")
public class DoctorController {
	
	@Autowired 
	private DoctorRepository doctorRepository;
	
	@GetMapping("/doctors")
	
	public List<Doctor> getAllEmployeeess(){
		return doctorRepository.findAll();
		
	}
}
