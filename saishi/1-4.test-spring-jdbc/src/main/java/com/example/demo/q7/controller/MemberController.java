package com.example.demo.q7.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.q7.repository.MemberRepository;

public class MemberController {
	@Autowired
	private MemberRepository repository;

	public String index() {
		
		
		return "member";
	}
}
