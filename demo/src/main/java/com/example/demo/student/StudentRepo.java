package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	Optional<Student> findStudentByEmail(String email);
	
}


//List.of(
//		new Student(1L, "Shashank", 20, LocalDate.of(2002, 7, 9), "shashank770@gmail.com")
//		);