package com.example.sms.Service;

import java.util.List;

import com.example.sms.Entity.Student;

public interface StudentService {

	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id );
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
