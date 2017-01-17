package com.sf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
  @RequestMapping("")
  public String user(){
    String path = "userController";
    path = "/pages/jsp/"+path+".jsp";
    return path;
  }
}
