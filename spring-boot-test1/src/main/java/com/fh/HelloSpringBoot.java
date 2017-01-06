package com.fh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringBoot {

	@Autowired
	DataBaseConfig dataBaseConfig;
	
    @ResponseBody
    @RequestMapping("/hello")
    String home() {
        return dataBaseConfig.getAddress()+dataBaseConfig.getContent();
    }

}
