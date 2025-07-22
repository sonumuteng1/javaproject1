package com.mehmet.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmet.controller.IStudentController;
import com.mehmet.entites.Student;
import com.mehmet.services.IStudentService;
//Amacımız bu sınıftan oluşturulan nesnelerin referanslarını Interface sayesinde yakalayıp yönetebilmek. 

@RestController
@RequestMapping("/rest/api/student")

public class StudentControllerImpl implements IStudentController {
	
	@Autowired
	private IStudentService studentService;
	
	
	@PostMapping(path = "/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {
		student=studentService.saveStudent(student);
		
		return student;
	}

	
	
}
