package com.H2database.H2databaseProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.H2database.H2databaseProject.entity.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student , Long>{

	Student findByStudentId(Long studentId);

	static Student findDataById(Long studentId) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
