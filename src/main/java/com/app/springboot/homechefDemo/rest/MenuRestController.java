package com.app.springboot.homechefDemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.homechefDemo.entity.Menu;
import com.app.springboot.homechefDemo.service.MenuService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/menu")
public class MenuRestController {
	
	private MenuService menuService;
	
	public MenuRestController() {}
	@Autowired
	public MenuRestController(MenuService menuService) {
		super();
		this.menuService=menuService; 
	}
	
	@GetMapping("/allMenu")
	public List<Menu> findAll(){
		return menuService.findAll();
	}
	

}
