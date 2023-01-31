package com.example.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.Entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
