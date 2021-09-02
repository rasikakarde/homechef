package com.app.springboot.homechefDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.homechefDemo.entity.Speciality;

public interface SpecialityRepository extends JpaRepository<Speciality, Integer>{

}
