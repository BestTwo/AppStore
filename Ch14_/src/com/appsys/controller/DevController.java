package com.appsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ǰ̨
 * @author Administrator
 *
 */
@RequestMapping(value="/dev")
@Controller
public class DevController {
	@RequestMapping(value="/login")
	public String login(){
		return "devlogin";
	}
}
