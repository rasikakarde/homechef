package com.app.springboot.homechefDemo.service;

import java.util.List;

import com.app.springboot.homechefDemo.entity.Chef;
import com.app.springboot.homechefDemo.entity.Speciality;

public interface SpecialityService {
	
	public List<Speciality> findAll();
	public int getSpecialityCount();
	public Chef findById(int cuisineid); 
	public void save(Chef theSpeciality);
	public void deleteById(int cuisineid);
	void updateSpeciality(int cuisineid, Speciality sp); 

}
