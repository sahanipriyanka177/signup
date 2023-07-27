package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.login;
import com.example.crud.repository.LoginRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class LoginController {
	@Autowired
	private LoginRepository repo1;
	@PostMapping("/login")
	public ResponseEntity<login>loginUser(@RequestBody login data) {
		
		System.out.println("Login Controller Called");
		return ResponseEntity.ok(repo1.save(data));
	}
}
