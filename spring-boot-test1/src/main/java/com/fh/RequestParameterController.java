package com.fh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("helloParam")
@RequestMapping("test/param")
public class RequestParameterController {

	@Autowired
	DataBaseConfig dataBaseConfig;
	
    @ResponseBody
    @GetMapping("/helloGet/{pathParam}")
    String helloGet(@PathVariable(name="pathParam")String pathParam,@RequestParam("param")String requestParam) {
        return "pathParam:"+ pathParam + ",param:"+requestParam;
    }
    
    @ResponseBody
    @PostMapping("/helloPost/{name}/id")
    String helloPost(@PathVariable(name="name") String string) {
      return "name is "+ string;
    }
    
    @ResponseBody
    @PostMapping("/helloPost/{id}/user")
    String getUserProfile(@PathVariable(name="id") String string,@RequestParam(defaultValue="default") String profile) {
      return "Id" + string +"profile data is "+ profile;
    }
    
    
    
}
