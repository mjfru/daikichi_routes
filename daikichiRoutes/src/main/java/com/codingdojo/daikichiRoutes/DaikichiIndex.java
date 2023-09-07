package com.codingdojo.daikichiRoutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DaikichiIndex {
	@RequestMapping("/")
	public String index() {
	return "Because no one wants to look at an error message...Welcome to the Daikichi Routes Assignment!";
	}
}
