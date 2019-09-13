package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") //high level mapping, parent mapping to correct error 500 from AnotherController
public class HelloWorldController {
	
	//controller method to show initial HTML form
	@RequestMapping("/showForm") //with addition of line 11, /showForm becomes a sub mapping /hello/showForm to remove ambiguous error in AnotherController
	public String showForm() {
		return "helloworld-form"; //jsp file
	}
	
	//controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld"; //jsp file
	}
	
	//controller method to read form data and add data to model
	@RequestMapping("/processFormVersion2")
	public String processFormVersion2(HttpServletRequest request, Model model) {
		
		/**
		 * HttpServletRequest reads form data 
		 * Model is the container that holds your data, initially empty so this method populates it
		 * */
		
		//read the request parameter from the HTML form
		String newName = request.getParameter("studentName"); //param is the form field studentName
		
		//convert data to all caps
		newName = newName.toUpperCase();
		
		//create message
		String result = "All caps conversion: " + newName;
		
		//add message to the model
		model.addAttribute("nameThisWhatever", result);
		
		return "helloworld"; //helloworld.jsp file
	}
	
	//controller method to read form data and add data to model
	//@RequestParam used for annotation binding
	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(@RequestParam("studentName") String newName, Model model) {
		
		//convert data to all caps
		newName = newName.toUpperCase();
		
		//create message
		String result = "Version 3 implementation: " + newName;
		
		//add message to the model
		model.addAttribute("nameThisWhatever", result);
		
		return "helloworld"; //helloworld.jsp file
	}
}
