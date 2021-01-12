package com.example.itg;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
	
	@RequestMapping("/")
	String display() {
		return "welcome";
		
	}
	@RequestMapping(value="/addnumbers")
			int add(){
		return 10+20;
		
	}

}
