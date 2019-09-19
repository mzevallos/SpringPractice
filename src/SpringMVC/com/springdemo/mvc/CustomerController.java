package com.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add initbinder to pre-process all web requests coming into the controller
	//remove leading and trailing whitespace
	//resolve issue for validation
	
	@InitBinder
	public void initBinder(WebDataBinder wdb) {
		
		//part of the Spring API, constructor value of true will reduce whitespace to null if the only content is whitespace
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		
		wdb.registerCustomEditor(String.class, ste);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Customer c = new Customer();
		
		theModel.addAttribute("customerReference", c);
		
		return "customer-form";
	}

	//Validation will occur in method signature. @valid performs validation, results are placed in BindingResult
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customerReference") Customer c, BindingResult br) {
		
		System.out.println("Last Name: |" + c.getLastName() + "|");
		System.out.println("Binding result: " + br);
		
		if(br.hasErrors())
		{
			return "customer-form";
		}
		return "customer-confirmation";
	}
	
}
