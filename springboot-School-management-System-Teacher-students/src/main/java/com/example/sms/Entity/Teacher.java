package com.example.sms.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long teacherid;
	
	@Column(name="teacher-name")
	private String teacherName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="subject")
	private String subject;
	
	
	
	

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Teacher(long teacherid, String teacherName, String email, String subject) {
		super();
		this.teacherid = teacherid;
		this.teacherName = teacherName;
		this.email = email;
		this.subject = subject;
	}



	public long getTeacherid() {
		return teacherid;
	}


	public void setTeacherid(long teacherid) {
		this.teacherid = teacherid;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
