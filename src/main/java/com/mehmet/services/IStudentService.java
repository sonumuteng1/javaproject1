package com.mehmet.services;

import java.util.List;
import java.util.Optional;

import com.mehmet.entites.Student;

public interface IStudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Optional<Student> getStudentById(Integer id);
	
	public Optional<Student> deleteStudentById(Integer id);
	
}
