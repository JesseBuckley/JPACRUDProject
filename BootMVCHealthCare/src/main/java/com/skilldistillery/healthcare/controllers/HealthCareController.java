package com.skilldistillery.healthcare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.healthcare.controllers.data.HealthCareDAO;

@Controller
public class HealthCareController {

	@Autowired
	private HealthCareDAO healthDAO;

	@RequestMapping(path = {"", "/", "home.do"})
	public String index(Model model) {		
		return "home"; 
	}
}
