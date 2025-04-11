package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebRest {
	@GetMapping("/")
	public String getMethodName() {
		return "Hello, My name is Harish and This is my first Rest Application";
	}
	
}
