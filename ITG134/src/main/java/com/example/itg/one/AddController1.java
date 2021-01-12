package com.example.itg.one;

import org.springframework.web.bind.annotation.RequestMapping;

public class AddController1 {
	
	@RequestMapping("/")
	String display() {
		return "welcome";
		
	}
	@RequestMapping(value="/add2")
			int add(){
		return 10+20;
	}
	}