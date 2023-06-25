package com.wildcodeschool.myProjectWithSecurity.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to the SHIELD";
	}
	@GetMapping("/avengers/assemble")
	public String avengersAssemble() {
		return "Avengers... Assemble";
	}
	@GetMapping("/secret-bases")
	public List<String> secretBases() {
		List<String> listVille = Arrays.asList("Biarritz", "Bordeaux", "La Loupe", "Lille", "Lyon", "Nantes", "Orléans", "Paris", "Reims", "Strasbourg", "Toulouse","Amsterdam","Barcelone","Berlin","Lisbonne","Madrid");
		return listVille;
	}

}
