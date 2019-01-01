package com.petClinic.praty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petClinic.praty.services.VetService;

@Controller
public class VetController {

	private final VetService vetService;
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}


	@RequestMapping({"/vets","/vets/index"})
	public String getVets(Model modal) {
		
		modal.addAttribute("vets",vetService.findAll());
		return "/vets/index";
	}
}
