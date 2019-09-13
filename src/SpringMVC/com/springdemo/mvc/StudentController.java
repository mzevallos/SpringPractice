package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create a new Student Object
		Student theStudent = new Student();
		
		//add Student Object as a Model attribute
		theModel.addAttribute("modelStudentAttribute", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("modelStudentAttribute") Student theStudent) {
		
		//log input data
		System.out.println("Student Information: " + theStudent.getFirstName() +
				" " + theStudent.getLastName());
		
		return "student-confirmation";
		
	}
}
