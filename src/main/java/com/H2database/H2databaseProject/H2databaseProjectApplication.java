package com.H2database.H2databaseProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.H2database.H2databaseProject.entity.Student;
import com.H2database.H2databaseProject.repository.StudentRepository;

@SpringBootApplication
public class H2databaseProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2databaseProjectApplication.class, args);
	}
////	@Autowired 
////	private StudentRepository studentrepo;
////	
////	
////	@Override
////	public void run(String... args) throws Exception {
////	    
//////		        Student s1 =Student.builder().fristName("swetha").lastName("Endla").email("swetha@gmail.com").build();
////	            Student s1 = new Student();
////	
	@Bean
	public RestTemplate resttemplate() {
		return new RestTemplate();
	}
	            		
	}


