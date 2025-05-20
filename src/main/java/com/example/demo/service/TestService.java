package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ManeMembers;
import com.example.demo.repo.TestRepo;

@Service
public class TestService {

	@Autowired
	TestRepo testrepo ;
	
	public ManeMembers addManeMember(ManeMembers mm) {
		return testrepo.save(mm);
	}
}
