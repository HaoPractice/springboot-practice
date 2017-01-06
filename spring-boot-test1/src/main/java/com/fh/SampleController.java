package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication  
public class SampleController {

    public static void main(String[] args) throws Exception {
       SpringApplication.run(SampleController.class, args);
    }
}