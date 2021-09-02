package com.app.springboot.homechefDemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.app.springboot.homechefDemo.dto.ChefMenuDto;
import com.app.springboot.homechefDemo.entity.Chef;

@EnableJpaRepositories 
public interface ChefRepository extends JpaRepository<Chef, Integer>{

	@Query(value="select count(chefid) from Chef")
	public int getChefCount();
	

	@Query("SELECT new com.app.springboot.homechefDemo.dto.ChefMenuDto(m.menuname, m.description, m.price, m.image) "
			+ "FROM Chef cd INNER JOIN cd.menu m "
			+ "where cd.chefid = ?1")
	public List<ChefMenuDto> getAllChefDetailsById(int chefid);

	@Query("SELECT c FROM Chef c WHERE c.emailid = :emailid")
	public Chef getUserByUsername(@Param("emailid") String emailid);
	
	@Transactional
	@Modifying
	@Query("UPDATE Chef c SET c.chefimagename = :fileName where chefid = :chefid")
	public void updateChefImage(int chefid, String fileName);

	@Query("SELECT c.chefimagename FROM Chef c WHERE c.chefid = :chefid")
	public String findChefImageById(int chefid);

	@Query("SELECT c FROM Chef c where c.city = :city")
	public List<Chef> getChefByCity(String city);
	
}
	
	
