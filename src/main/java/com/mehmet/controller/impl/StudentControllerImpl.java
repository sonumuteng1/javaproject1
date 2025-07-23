package com.mehmet.controller.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmet.controller.IStudentController;
import com.mehmet.dto.DtoStudent;
import com.mehmet.dto.DtoStudentIU;
import com.mehmet.entites.Student;
import com.mehmet.services.IStudentService;
//Amacımız bu sınıftan oluşturulan nesnelerin referanslarını Interface sayesinde yakalayıp yönetebilmek. 

@RestController
@RequestMapping("/rest/api/students")

public class StudentControllerImpl implements IStudentController {
	
	@Autowired
	private IStudentService studentService;
	
	
	@PostMapping()
	@Override
	public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
		
		DtoStudent student=studentService.saveStudent(dtoStudentIU);
		
		return student;
	}

	@GetMapping()
	@Override
	public List<Student> getAllStudents() {
		List<Student> getallStudents=studentService.getAllStudents();
		return getallStudents;
	}
	
	@GetMapping(path = "/{id}")
	@Override
	public Optional<Student> getStudentById(@PathVariable(name="id") Integer id) {
		Optional<Student> student=studentService.getStudentById(id);
		return student;
	}

	@DeleteMapping(path = "/{id}")
	@Override
	public Optional<Student> deleteStudentById(@PathVariable(name="id") Integer id) {
		Optional<Student> student=studentService.deleteStudentById(id);
		return student;
	}

	
	
	
}
