package com.andrewsouthard1.southardtest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() throws UnknownHostException {
		String hostname = null;
		try {
			hostname = InetAddress.getLocalHost()
								  .getHostAddress();
		} catch (UnknownHostException e) {
			hostname = "unknown";
		}
		return "Hello Spring Boot " + hostname;
	}
}
