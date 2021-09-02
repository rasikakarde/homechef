package com.app.springboot.homechefDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.springboot.homechefDemo.entity.Chef;
import com.app.springboot.homechefDemo.service.ChefService;

//@Controller
//@CrossOrigin(origins = "*")
//@RequestMapping("/signup")
/*public class ChefLoginRestController {
	
private ChefService chefService;
	
	public ChefLoginRestController() {}
	
	
	@Autowired
	public ChefLoginRestController(ChefService chefService) {
		super();
		this.chefService = chefService;
	}
	
	@PostMapping("/processRegister")
	public String processRegister(Chef chef) {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode(chef.getPassword());
	    chef.setPassword(encodedPassword);	     
	    chefService.save(chef);
		return "register_success";		
	}*/
	
	/*@PostMapping(value ="/cheflogin")
	public String login(@ModelAttribute("login") Chef cheflogin, BindingResult bindingResult, ModelMap model) {
		
		Chef chef = chefService.validateUser(cheflogin);
		
		boolean isValidUser = false;
		
		if (null != chef && chef.getEmailid().equals(cheflogin.getEmailid())
		        && chef.getPassword().equals(cheflogin.getPassword())) {
		      isValidUser = true;
		      model.addAttribute("emailid", chef.getEmailid());
		    }
		
		return isValidUser ? "welcome" : "login" ;
			
	}*/
	

//}
