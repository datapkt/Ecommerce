package com.datapkt.Data.Pkt.Ecommerce.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {
	
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "Hello DataPakters";
	}

}
