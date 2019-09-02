package com.appsys.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/backend")
public class BackendController {
	@RequestMapping(value="/login.html")
	public String login(){
		return "backendlogin";
	}
}
