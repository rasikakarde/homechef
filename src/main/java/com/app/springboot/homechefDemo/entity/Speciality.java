package com.app.springboot.homechefDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="speciality")
public class Speciality {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cuisineid")
	private int cuisineid;
	
	@Column(name="cuisinetype")
	private String cuisinetype;
	
	@Column(name="chefid")
	private int chefid;
	
	public Speciality()
	{}
	
	public Speciality(int cuisineid, String cuisinetype, int chefid) {
		super();
		this.cuisineid = cuisineid;
		this.cuisinetype = cuisinetype;
		this.chefid = chefid;
	}
	
	
	public int getCuisineid() {
		return cuisineid;
	}
	public void setCuisineid(int cuisineid) {
		this.cuisineid = cuisineid;
	}
	public String getCuisinetype() {
		return cuisinetype;
	}
	public void setCuisinetype(String cuisinetype) {
		this.cuisinetype = cuisinetype;
	}
	public int getChefid() {
		return chefid;
	}
	public void setChefid(int chefid) {
		this.chefid = chefid;
	}

	@Override
	public String toString() {
		return "Speciality [cuisineid=" + cuisineid + ", cuisinetype=" + cuisinetype + ", chefid=" + chefid + "]";
	}
	
	

}
