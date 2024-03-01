package com.klef.jfsd.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.service.*;


@Controller
public class ClientController 
{
	@Autowired
	private AdminService adminservice;
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
}
