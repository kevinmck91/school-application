package com.school.application.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.school.application.dtos.Student;

// Takes in the Entity and the primary Key
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	// Method names define the 'SQL' that is generated by spring.
	List<Student> findByForename(Optional<String> forename);
	
    List<Student> findById(Optional<Integer> id);


}
