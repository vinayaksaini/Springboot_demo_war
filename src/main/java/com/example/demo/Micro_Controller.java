package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Micro_Controller {
	
	@ResponseBody
	@RequestMapping("/")
	public String controller1() {
		return "hello";
	}

	@RequestMapping("/N")
	public String controller2() {
		return "NewFile";
	}
}
