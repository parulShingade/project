package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sms.Entity.Student;
import com.example.sms.Repository.StudentRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootStudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Ramesh","fadatsre","ramesh@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("ayush","fadatsre","ayush@gmail.com");
		studentRepository.save(student2);
	}
	@GetMapping("/students/new")
	public String cerateStudentForm( Model model) {
		
		Student student= new Student();
		model.addAttribute("student",student);
		return" create_student";
	}

}
