package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication  
public class SpringBootRunner {

    public static void main(String[] args) throws Exception {
       SpringApplication.run(SpringBootRunner.class, args);
    }
}