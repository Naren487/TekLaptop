package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController()
@CrossOrigin
@RequestMapping("")
public class EmployeeController {
	@GetMapping("/getAllProducts")
	public String getAll() {
		System.out.println("Allllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll");
		return "Data";
	}
}
