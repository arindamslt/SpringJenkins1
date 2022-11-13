package com.arindam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
public String getData()
{
	return "<h2>WELCOME</h2>";
}
	@GetMapping("/home")
	public String getDatas()
	{
		return "<h2>WELCOME TO JENKINS</h2>";
	}
	@GetMapping("/ui")
	public String getPipe()
	{
		return "<h2>WELCOME TO JENKINS PIPELINE</h2>";
	}
}
