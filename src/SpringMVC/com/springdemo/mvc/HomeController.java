package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //extends off of @Component
public class HomeController {
	
	@RequestMapping("/") //map a url request to the method, one / with no mapping after is the initial page to boot
	public String showPage()
	{
		//full path name: WEB_INF/view/main-menu.jsp prefix and suffix specified in xml file
		return "main-menu"; //name of the page we want to return. will auto-append prefix and suffix from xml file
	}

}
