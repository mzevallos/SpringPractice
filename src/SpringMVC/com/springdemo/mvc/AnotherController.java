package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnotherController {

	//HTTP status 500 error, ambiguous mapping, showForm is already being used
	//to correct this, parent mapping is required
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "testing";
		
	}

}
