package com.mehmet.controller;

import java.util.List;
import java.util.Optional;

import com.mehmet.entites.Student;

//Controller'dan implemente edilen sınıfları burada tutuyoruz. 
public interface IStudentController {
	
	public Student saveStudent(Student student); 
	
	public List<Student> getAllStudents();
	
	public Optional<Student> getStudentById(Integer id);

	public Optional<Student> deleteStudentById(Integer id);
	
}
