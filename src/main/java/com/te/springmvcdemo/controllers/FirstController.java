package com.te.springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	
	@RequestMapping(path = "/first", method = RequestMethod.GET)
	public ModelAndView getFirstPage() {
		ModelAndView andView = new ModelAndView();
		andView.addObject("name", "Pradeep");
//		andView.setViewName("/WEB-INF/views/app.jsp");
		andView.setViewName("app");

		return andView;
	}

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public ModelAndView getUserData(ModelAndView modelAndView) {
//		modelAndView.setViewName("/WEB-INF/views/user.jsp");
		modelAndView.setViewName("user");

		return modelAndView;
	}
	

	@GetMapping("/second")
	public String getUser(ModelMap map) {
		map.addAttribute("name", "Smith");
		return "app";
	}

}
