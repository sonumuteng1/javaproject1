package com.mehmet.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmet.entites.Student;
import com.mehmet.repository.StudentRepository;
import com.mehmet.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		student=studentRepository.save(student);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> allStudents=studentRepository.findAll();
		return allStudents;
	}

	@Override
	public Optional<Student> getStudentById(Integer id) {
		
		Optional<Student> student=studentRepository.findById(id);
		return student;
	}

	@Override
	public Optional<Student> deleteStudentById(Integer id) {
		 
		Optional<Student> student=getStudentById(id);
		
		studentRepository.deleteById(id);
		return student;
	}

}
