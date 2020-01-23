package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;


public class UserService {
	@Autowired
	UserRepo repo;

	public List<User> getUsers(){
		return repo.findAll();
	}
	public ResponseEntity<?> addUser(User user) {
		repo.save(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	public ResponseEntity<User> updateUser(String id,User user) {
		if(repo.existsById(id)) {
			repo.u
		}else {
			
		}
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	public void deleteUser(String id) {
		
	}
	public User getUserById(String id) {
		return repo.getOne(id);
	}
	public User findByName(String name) {
		return repo.findByName(name);
	}
}