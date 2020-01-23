package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserRepo;
import com.example.demo.model.User;

@RestController
@RequestMapping("/Users")
public class UserController {
	@Autowired
	UserRepo repo;
	@RequestMapping("/all")
	public List<User> getUsers(){
		return repo.findAll();
	}
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		repo.save(user);
		return new ResponseEntity<String>("Added user: "+ user.getfName(),HttpStatus.OK);
	}
	@PutMapping("/update")
	public void updateUser(@RequestBody User user) {
		repo.save(user);
	}
}
