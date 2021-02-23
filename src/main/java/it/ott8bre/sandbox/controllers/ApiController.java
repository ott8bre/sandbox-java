package it.ott8bre.sandbox.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class ApiController {
  
  @GetMapping("integer_square_root/{input}")
	@ResponseBody
	public int integerSquareRoot(@PathVariable("input") int x) {
    throw new UnsupportedOperationException("not implemented yet");
  }

}
