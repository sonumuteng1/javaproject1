package com.mehmet.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmet.dto.DtoStudent;
import com.mehmet.dto.DtoStudentIU;
import com.mehmet.entites.Student;
import com.mehmet.repository.StudentRepository;
import com.mehmet.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
		/*Dönüş tipi DtoStudent oldu. Metot nesne olarak DtoStudentUI aldı. Çünkü iki dto nesnesinin fieldları farklı. 
		* Save için dateOfBirth verisini alıyoruz ama respons için bunu dönmüyoruz mesela .
		* BeanUtils ile dtoStudentI içerisindeki fieldları student içerisine kopyalıyoruz. 
		* 
		*
		*/
		Student student=new Student();
		DtoStudent response=new DtoStudent();
		BeanUtils.copyProperties(dtoStudentIU, student);
		student=studentRepository.save(student);
		
		BeanUtils.copyProperties(student, response);
		return response;
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
