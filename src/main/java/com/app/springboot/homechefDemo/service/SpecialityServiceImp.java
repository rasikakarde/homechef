package com.app.springboot.homechefDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springboot.homechefDemo.dao.SpecialityRepository;
import com.app.springboot.homechefDemo.entity.Chef;
import com.app.springboot.homechefDemo.entity.Speciality;

@Service
public class SpecialityServiceImp implements SpecialityService {
	
	@Autowired
	SpecialityRepository specialityRepository;
	
	public SpecialityServiceImp(SpecialityRepository specialityRepository)
	{
		super();
		this.specialityRepository=specialityRepository;
		
	}

	@Override
	public List<Speciality> findAll() {
		// TODO Auto-generated method stub
		return specialityRepository.findAll();
	}

	@Override
	public int getSpecialityCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Chef findById(int cuisineid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Chef theSpeciality) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int cuisineid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSpeciality(int cuisineid, Speciality cd) {
		// TODO Auto-generated method stub
		
	}

}
