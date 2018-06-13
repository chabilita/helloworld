package com.shvid.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.addObject("name", "Charisse");
		view.setViewName("index");
		return view;
	}
	
}
