package com.sf;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class SpringBootRunner {

    public static void main(String[] args) throws Exception {
       SpringApplication.run(SpringBootRunner.class, args);
    }
    @Test
    public void testRun(){
      SpringApplication.run(SpringBootRunner.class);
    }
}