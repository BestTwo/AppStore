package com.appsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/backend")
@Controller
public class BackendController {
	@RequestMapping(value="/login")
	public String login(){
		return "backendlogin";
	}
}
