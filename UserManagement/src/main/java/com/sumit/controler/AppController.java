package com.sumit.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="")
public class AppController {
	
	@GetMapping(value="")
	public String index()
	{
		return "index";
	}

}
