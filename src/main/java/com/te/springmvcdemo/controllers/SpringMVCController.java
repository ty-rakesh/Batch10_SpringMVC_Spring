package com.te.springmvcdemo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvcdemo.beans.UserBean;

@Controller 
public class SpringMVCController {

	
	@GetMapping("/login")
	public String getLoginPage(){
		return "login";
	}
	
	@PostMapping("/login")
	public String getformData(HttpServletRequest request,ModelMap map){
		String username=request.getParameter("user");
		String password=request.getParameter("pwd");
		map.addAttribute("user", username);
		map.addAttribute("pwd", password);
		return "home";
		
	}
	
	@PostMapping("/login1")
	public String getDataFormRequestParam(@RequestParam(name = "user") String name, @RequestParam(name = "") String pwd,
			ModelMap map) {
		map.addAttribute("user", name);
		map.addAttribute("pwd", pwd);
		return "home";

	}
	@PostMapping("/login2")
	public String getDataFromMethod(String user, String pwd, ModelMap map) {
		map.addAttribute("user", user);
		map.addAttribute("pwd", pwd);
		return "home";
	}
	@PostMapping("/login3")
	public String getDataFromDTO(UserBean bean, ModelMap map) {
	System.out.println(bean);
	map.addAttribute("user", bean.getUser());
	map.addAttribute("pwd", bean.getPwd());
	return "home";
}
}
