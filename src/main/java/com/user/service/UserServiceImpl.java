package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;


@Service
public class UserServiceImpl implements UserService{
	
	
	//dummy user List
	
	List<User> list = List.of(
			          new User(1990L,"scoot","98006767"),
			          new User(1980L,"kevin","88009809"),
			          new User(1700L,"David","2233290"),
			          new User(1840L,"samuels","1133211"),
			          new User(3090L,"Johnathan","2237690")
			          );
	
	@Override 
	public User getUser(Long id) {
		return list.stream().filter(u -> u.getUserId().equals(id)).findAny().orElse(null);
	}
	
	

}
