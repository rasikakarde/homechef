package com.app.springboot.homechefDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.springboot.homechefDemo.entity.Menu;

public interface MenuRepository extends JpaRepository <Menu, Integer> {
	
	//@Query(value="select count(menuid) from menu")
	//public int getMenuCount();

}
