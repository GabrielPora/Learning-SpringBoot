package com.therealdanvega.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {

//	This is for global error handler 
	@ExceptionHandler(Exception.class)
	public String exception(Exception exception, Model model){
		model.addAttribute("exception", exception);
		return "errorHandler";
	}
	
}
