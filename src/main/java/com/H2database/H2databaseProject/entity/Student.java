package com.H2database.H2databaseProject.entity;


import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="student")
public class Student {
	
	//Student s = Student.builder.firstName("swetha").lastName("Endla").email("sskm@gmail.com").build();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	
	@Column(name = "firstname", nullable= true)
	private String firstName;
	@Column(name = "lastname", nullable= true)
	private String lastName;
	
	@Column(name = "email", nullable= true)
	private String email;

	public long getStudentId() {
		return studentId;
		
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
