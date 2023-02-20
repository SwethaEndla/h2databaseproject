package com.H2database.H2databaseProject.vo;

import com.H2database.H2databaseProject.entity.Student;
import com.H2database.H2databaseProject.repository.StudentRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
       private Student student;
       private Department department;
	}
