package com.mehmet.services.impl;

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

}
