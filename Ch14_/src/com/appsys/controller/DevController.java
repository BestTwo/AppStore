package com.appsys.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ǰ̨
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/dev")
public class DevController {
	public Logger logger = Logger.getLogger(DevController.class);
	@RequestMapping(value="/login.html")
	public String login(){
		logger.error("sdfdsfdsfadfsdfdsfdsfafdsafefdsdf");
		return "devlogin";
	}
}
