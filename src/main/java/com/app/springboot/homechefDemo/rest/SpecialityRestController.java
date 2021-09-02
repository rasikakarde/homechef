package com.app.springboot.homechefDemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.homechefDemo.entity.*;
import com.app.springboot.homechefDemo.service.SpecialityService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/speciality")
public class SpecialityRestController {
	
	private SpecialityService specialityService;
	
	public SpecialityRestController () {}
	
	@Autowired
	public SpecialityRestController (SpecialityService specialityService) {
		super();
		this.specialityService = specialityService;
	}
	
	@GetMapping("/allSpeciality")
	public List<Speciality> findAll()
	{
		return specialityService.findAll();	
	}
	
	

}
