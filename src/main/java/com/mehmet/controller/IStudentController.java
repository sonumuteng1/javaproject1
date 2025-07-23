package com.mehmet.controller;

import java.util.List;
import java.util.Optional;

import com.mehmet.dto.DtoStudent;
import com.mehmet.dto.DtoStudentIU;
import com.mehmet.entites.Student;

//Controller'dan implemente edilen sınıfları burada tutuyoruz. 
public interface IStudentController {
	
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU); 
	
	public List<Student> getAllStudents();
	
	public Optional<Student> getStudentById(Integer id);

	public Optional<Student> deleteStudentById(Integer id);
	
}
