package com.studentManagement.service;

import java.util.List;

import com.studentManagement.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int theId);

	public void saveStudent(Student theStudent);

	public void deleteById(int theId);

//	void updateStudent(Student theStudent);

	public void updateStudent(Student theStudent);
}
