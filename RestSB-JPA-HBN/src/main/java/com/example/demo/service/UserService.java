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
	public ResponseEntity<User> addUser(User user) {
		User user1=repo.save(user);
		return new ResponseEntity<User>(user1,HttpStatus.OK);
	}
	public ResponseEntity<User> deleteUser(Long id) {
		User user1 = null;
		if(repo.existsById(id)) {
			User user =  repo.getOne(id);
			user.setDeleted(true);
			user1=repo.save(user);
			return new ResponseEntity<User>(user1,HttpStatus.OK);
		}
		return new ResponseEntity<User>(user1,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<User> getUserById(Long id) {
		User user = null;
		if(repo.existsById(id)) {
			user =  repo.getOne(id);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		else{  
			return new ResponseEntity<User>(user,HttpStatus.NOT_FOUND);
		}
	}
	public User findByName(String name) {
		return repo.findByName(name);
	}
}