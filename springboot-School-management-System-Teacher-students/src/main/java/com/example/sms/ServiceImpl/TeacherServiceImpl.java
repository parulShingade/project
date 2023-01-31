package com.example.sms.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sms.Entity.Teacher;
import com.example.sms.Repository.TeacherRepository;
import com.example.sms.Service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	private TeacherRepository teacherRepository;

	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher getTeacherById(Long id) {
		// TODO Auto-generated method stub
		return teacherRepository.findById(id).get();
	}

	@Override
	public  void deleteTeacherById(Long id) {
		// TODO Auto-generated method stub
		
		 teacherRepository.deleteById(id);
	}

	
	
	
	
	
}
