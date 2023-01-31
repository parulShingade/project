package com.example.sms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sms.Entity.Teacher;
import com.example.sms.Service.TeacherService;

@Controller
public class TeacherController {

	private TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	@GetMapping("/teachers")
	public String listTeachers(Model model) {
		model.addAttribute("teachers", teacherService.getAllTeachers());
		return"teachers";
	}
	
	@PostMapping("/teachers")
	public String saveString(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.saveTeacher(teacher);
		return "redirect:/teacher";
	}
	
	@GetMapping("/teachers/new")
	public String createTeacherForm(Model model) {
		Teacher teacher=new Teacher();
		model.addAttribute("teacher", teacher);
	    return "create_teacher";
	}
	
	@PostMapping("/teachers/{id}")
	public String updateTeacher( @PathVariable Long id, @ModelAttribute Teacher teacher, Model model) {
		
		Teacher existingTeacher = teacherService.getTeacherById(id);
		existingTeacher.setTeacherid(id);
		existingTeacher.setTeacherName(teacher.getTeacherName());
		existingTeacher.setEmail(teacher.getEmail());
		existingTeacher.setSubject(teacher.getSubject());
		
		teacherService.updateTeacher(existingTeacher);
		return " redirect:/teachers";
	}
	
	@GetMapping("/teachers/{id}")
	public String deleteTeacher(@PathVariable Long id) {
		
		teacherService.deleteTeacherById(id);
		return " redirect:/teachers";
		
	}
	
	
}
