package com.project.hellohuman.controllers;

import java.security.Principal;
import java.util.Date;

import javax.print.MultiDoc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HumanController{
	//Member variables go here

	public HumanController(){

	}
	
	@RequestMapping("/")
	public String index(@RequestParam(defaultValue="human", value="first_name", required=false) String firstName, @RequestParam(defaultValue="person", value="last_name", required=false) String lastName, Model model){
			// System.out.printf("passing if statement %s", firstName);

			model.addAttribute("firstName", firstName);
			model.addAttribute("lastName", lastName);
			return "index";
	}
	// @RequestMapping("/{fistName}/{lastName}")
	// public String human(@RequestParam()){

	// }
}
