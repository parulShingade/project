package com.example.sms.Service;

import java.util.List;

import com.example.sms.Entity.Teacher;

public interface TeacherService {

	
	List<Teacher> getAllTeachers();
	
	Teacher saveTeacher(Teacher teacher);
	
	Teacher updateTeacher(Teacher teacher);
	
	Teacher getTeacherById(Long id);
	
	 void deleteTeacherById(Long id);
	
}
