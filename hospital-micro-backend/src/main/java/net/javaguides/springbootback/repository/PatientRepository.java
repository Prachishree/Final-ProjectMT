package net.javaguides.springbootback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootback.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>


{

}

