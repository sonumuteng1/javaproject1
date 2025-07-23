package com.mehmet.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	private String firstName;
	
	private String lastName;
	
	private Date dateOfBirth;
	

}
