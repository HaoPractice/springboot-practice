package com.fh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello")
public class RequestParameterController {

	@Autowired
	DataBaseConfig dataBaseConfig;
	
	@ResponseBody
	@GetMapping("/hello")
	String home() {
	  return dataBaseConfig.getAddress()+dataBaseConfig.getContent();
	}
	
    @ResponseBody
    @GetMapping("/helloGet")
    String helloGet() {
        return "helloGet";
    }
    
    @ResponseBody
    @PostMapping("/helloPost")
    String helloPost() {
      return "helloPost";
    }

}
