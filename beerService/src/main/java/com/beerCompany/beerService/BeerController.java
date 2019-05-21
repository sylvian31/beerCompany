package com.beerCompany.beerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/beerService")
public class BeerController {

	Logger logger = LoggerFactory.getLogger(BeerController.class);

	@GetMapping
	public String home() {
		return "Hello there !";
	}
}
