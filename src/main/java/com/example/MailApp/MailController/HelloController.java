package com.example.MailApp.MailController;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
	
	@RequestMapping("/hello_user/{id}")
	public String hello_user(Model model,@PathVariable int id,@RequestParam(required=false) String firstname,@RequestParam Optional<String>lastname) {
		model.addAttribute("fname",firstname);
		model.addAttribute("lname",lastname);
		model.addAttribute("id",id);
		return "hello_user";
	}

	@RequestMapping("/hello")
	public String hello(Model model) {
		return "hello";
	}
}
