package net.javaguides.springbootback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springbootback.model.Patient;
import net.javaguides.springbootback.repository.PatientRepository;

@RestController
@RequestMapping("/api/v1")
public class PatientController {
	
	@Autowired 
	private PatientRepository patientRepository;
	
	@GetMapping("/patients")
	
	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
		
	}
	
	@PostMapping("/patients")
	public Patient createPatient (@RequestBody Patient patient) {
		return patientRepository.save(patient);
		
		
	}
}

