package com.H2database.H2databaseProject.Service;

import com.H2database.H2databaseProject.entity.Student;
import com.H2database.H2databaseProject.vo.ResponseTemplateVO;

public interface StudentService {
    public Student saveStudent(Student student);

	public Student findStudentById(Long studentId);

	public ResponseTemplateVO findDataById(Long studentId);
 
}

