package com.nagarro.ourapp.controller;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AdditionController {
	
	@RequestMapping("/add")
	public ModelAndView getAdditionResult(HttpServletRequest request, HttpServletResponse response ) {
		ModelAndView mv = new ModelAndView();
		
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		
		int c = a+b;
		mv.addObject("result", c);
		mv.setViewName("add-result");
		return mv;
		
	}
}

