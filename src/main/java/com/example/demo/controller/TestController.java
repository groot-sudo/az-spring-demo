package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ManeMembers;
import com.example.demo.service.TestService;

@RestController
@RequestMapping("/appl")
public class TestController {
	
	@Autowired
	TestService testService;

	@GetMapping("/test")
	public String testApplication() {
		return "New test!!!";
	}
	
	 @PostMapping("/add")
	    public ManeMembers addMember(@RequestBody ManeMembers member) {
	        return testService.addManeMember(member);
	    }
	
}
