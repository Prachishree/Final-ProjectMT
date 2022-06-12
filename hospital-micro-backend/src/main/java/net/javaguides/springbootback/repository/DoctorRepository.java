package net.javaguides.springbootback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootback.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>


{

}
