package it.ott8bre.sandbox.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;

@Controller
public class HomeController {
	
	@Value("${info.app.name}")
	private String name;
	
	@Value("${info.app.description}")
	private String description;
	
	@Value("${info.app.version}")
	private String version;
	
	@Value("${info.app.encoding}")
	private String encoding;
	
	@Value("${info.app.java.version}")
	private String java;
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		
		return "<!DOCTYPE html>"
			+"<html>"
			+"<head>"
			+"<title>" + description + "</title>"
			+"<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>"
			+"<style>"
			+"body { font-family: 'Roboto', sans-serif; }"
			+"</style>"
			+"</head>"
			+"<body>"

			+"<h1>" + description + "</h1>"
			+"<ul>"
			+	"<li>Problema 1: <a href='integer_square_root.html'>Radice quadrata di un intero</a></li>"
			+	"<li>Problema 2: <a href='parents_and_children.html'>Genitori e figli</a></li>"
			+	"<li>Problema 3: <a href='geometric_shapes.html'>Figure geometriche</a></li>"
			+"</ul>"

			+"</body>"
			+"</html>"

			//version 
			//+"jre version " + java + "." + " API browser available <a href='swagger-ui/'>here</a>"
			;
	}

}
