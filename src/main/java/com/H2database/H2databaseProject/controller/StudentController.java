package com.H2database.H2databaseProject.controller;

import com.H2database.H2databaseProject.entity.Student;
import com.H2database.H2databaseProject.repository.StudentRepository;
import com.H2database.H2databaseProject.vo.ResponseTemplateVO;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:3001/")
public class StudentController {

	@Autowired 
	private StudentRepository studentrepo;
	
	@Autowired
	private com.H2database.H2databaseProject.Service.StudentService stdService;
	
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		stdService.saveStudent(student);
		return "new student saved";
		
	}
	
	 @GetMapping("/list")
	 public List<Student> getStudents(){
		return studentrepo.findAll() ;
		 
	 }
	 
//	 public ResponseTemplateVO getStudentAndDepartment(@PathVariable("id") Long studentId ) {
//		return stdService.getStudentAndDepartment(studentId);
//		 
//	 }
	 @GetMapping(value="/student/{id}")
	public Student  findStudentById(@PathVariable("id") Long studentId) {
			return stdService.findStudentById(studentId);
			
	}
	 
	@GetMapping(value="/{id}")
	public ResponseTemplateVO findDataById(@PathVariable("id") Long departmentId, Long studentId ) {
		return stdService.findDataById(studentId);
		
	}
	 
	 

}
