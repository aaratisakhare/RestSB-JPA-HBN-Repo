package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/all")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) {
		return userService.addUser(user);
	}
	@PutMapping("/update")
	public void updateUser( @RequestBody User user) {
		userService.addUser(user);
	}
	@PutMapping("/delete/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
	@RequestMapping("/get/{id}")
	public void getUserById(@PathVariable Long id) {
		userService.getUserById(id);
	}
	@RequestMapping("/get/{name}")
	public void findByName(@PathVariable String name) {
		userService.findByName(name);
	}
	
}
