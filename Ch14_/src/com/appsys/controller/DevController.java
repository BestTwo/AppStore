package com.appsys.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ǰ̨
 * @author Administrator
 *
 */
@RequestMapping(value="/dev")
public class DevController {
	@RequestMapping(value="/login.html")
	public String login(){
		return "devlogin";
	}
}
