package com.blz.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloProjectController {
	
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("messageResponse", "This is a custom message.");
		return "message";
	}
}
