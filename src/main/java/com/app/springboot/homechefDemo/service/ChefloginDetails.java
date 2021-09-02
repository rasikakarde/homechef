package com.app.springboot.homechefDemo.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.springboot.homechefDemo.entity.Chef;

public class ChefloginDetails implements UserDetails {
	
	private Chef chef;
	
	public ChefloginDetails(Chef chef) {
		this.chef=chef;
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return chef.getPassword();
	}

	@Override
	public String getUsername() {
		return chef.getEmailid();
	}

	
	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

}
