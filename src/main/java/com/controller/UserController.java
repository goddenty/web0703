package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	@RequestMapping("/getUser")
	@ResponseBody
	public String getUser(int id) throws JsonProcessingException{
		User user = userService.getUserById(id);
		ObjectMapper om=new ObjectMapper();
		String writeValueAsString = om.writeValueAsString(user);
		return writeValueAsString;
	}
	@RequestMapping("/index")
	public String toIndex(){
		return "index";
	}
}

