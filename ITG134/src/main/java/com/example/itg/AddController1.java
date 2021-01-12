package com.example.itg;

import org.springframework.web.bind.annotation.RequestMapping;

public class AddController1 {
	
	@RequestMapping("/")
	String display() {
		return "welcome to itg 134 new";
		
	}
	@RequestMapping(value="/add")
			int add(){
		return 10+20;
	}
	}