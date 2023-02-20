package com.H2database.H2databaseProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.H2database.H2databaseProject.entity.Student;
import com.H2database.H2databaseProject.repository.StudentRepository;
import com.H2database.H2databaseProject.vo.Department;
import com.H2database.H2databaseProject.vo.ResponseTemplateVO;


@Service
public class StudentServiceImpl implements StudentService{
    
	@Autowired
	private StudentRepository stdrepo;
	
	@Autowired
	private RestTemplate resttemplate;
	
	
	Student student;
	
	@Override
	public Student saveStudent(Student student) {
		return stdrepo.save(student);
	}

	@Override
	public Student findStudentById(Long studentId) {
		
		return stdrepo.findByStudentId(studentId);
	}

	public ResponseTemplateVO findDataById(Long studentId) {
		ResponseTemplateVO respVO = new ResponseTemplateVO();
		Student std= StudentRepository.findDataById(studentId);
		Department department = resttemplate.getForObject("localhost:8088/department/"+student.getStudentId(), Department.class);
		return respVO;
	}

 
	
	
}
      