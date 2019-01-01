package com.petClinic.praty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"","/","/getIndexPage"})
	public String getIndex() {
		return "index";
	}
}
