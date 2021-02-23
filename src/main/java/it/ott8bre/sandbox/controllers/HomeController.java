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
		
		return 
			"<h1>" + description + "</h1>"
			+"<ul>"
			+	"<li>Problema 1: <a href='integer_square_root/'>Radice quadrata di un intero</a></li>"
			+	"<li>Problema 2: todo</li>"
			+	"<li>Problema 3: todo</li>"
			+"</ul>"
			//version 
			//+"jre version " + java + "." + " API browser available <a href='swagger-ui/'>here</a>"
			;
	}

	@RequestMapping("/integer_square_root")
	@ResponseBody
	public String integerSquareRoot() {
		return "<pre>"
			+ "<h1>Problema:</h1>"
			+	"<h3>Dato un intero x non negativo, trovare la radice quadrata intera y tale che y*y = x.</h3>"
			+ "<h3>Nel caso in cui y non fosse intero se ne consideri la sola parte intera.</h3>"
			//+ "Esempio x:4 y:2"
			+ "<br><br><br>"
			+ "<h2>Implementazione:</h2>"
			+ "Modificare il metodo <i>integerSquareRoot</i> della classe <b>it.ott8bre.sandbox.controllers.ApiController</b>"
			+ "<br><br><br>"
			+ "<h2>Test:</h2>"
			+ "<a href='/swagger-ui/#/api-controller/integerSquareRootUsingGET'>swagger-ui</a>"
			+"</pre>"
			;
	}


}
