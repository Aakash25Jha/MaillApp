package com.example.MailApp.MailController;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MailApp.Model.User;


@Controller
public class SignUpController {
	private static Log log = LogFactory.getLog(SignUpController.class);
	
	@PostMapping("/signUp")
	public String doSignUp(@Validated User user, BindingResult bindingResult) {
	/*user.setName(name);
	user.setEmail(email);
	user.setPassword(password);*/
		if(bindingResult.hasErrors())
		{
			return "signUp";
		}
		else {
		log.info("name is:"+user.getName()+"email is:"+user.getEmail()+"password is:"+user.getPassword());
		return "redirect:/";
	}
	}
	@GetMapping("/signUp")
	public String signUp() 
	{
		return "signUp";
	}
}
