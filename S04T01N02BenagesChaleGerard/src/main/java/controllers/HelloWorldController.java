package controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/api/v1")
@Controller
public class HelloWorldController {

	
	@GetMapping("/HelloWorld")
	@ResponseBody
	public String Saluda(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
		
		return "Hola, " + name + ". Est�s executant un projecte Gradle";
	}
	
	@GetMapping({"HelloWorld2", "/HelloWorld2/{name}"})
	@ResponseBody
	public String Saluda2(@PathVariable Optional <String> name) {

		if (name.isPresent()) {
			return "Hola, " + name.get() + ". Est�s executant un projecte Gradle";
		}else {
			return "Hola, UNKNOWN. Est�s executant un projecte Gradle";	
		}

	}


}