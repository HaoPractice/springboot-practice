package com.sf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.CharMatcher;
import com.google.common.primitives.Longs;
import com.sf.mapper.UserMapper;
import com.sf.model.User;
import com.sf.model.UserExample;
import com.sf.model.UserExample.Criteria;
import com.sf.service.UserService;

@RestController("helloDb")
@RequestMapping("test/db")
public class DbTestController {
  @Autowired
  UserMapper userMapper;
  @Autowired
  UserService userService;

  @Autowired
  DataBaseConfig dataBaseConfig;

  @GetMapping("/users")
  List<User> getUsersByName(@RequestParam String name) {
    UserExample example = new UserExample();

    Criteria createCriteria = example.createCriteria();
    createCriteria.andIduserIsNull();
    createCriteria.andUsernameEqualTo(name);
    return userMapper.selectByExample(example);
  }
  
  @GetMapping("/user")
  User getUserById(@RequestParam String id) {
    if (!CharMatcher.digit().matchesAllOf(id)) {
      return null;
    }
    return userMapper.selectByPrimaryKey(Integer.valueOf(id));
  }
  
  @GetMapping("/usersLike")
  List<User> getUsersByNameLike(@RequestParam String name) {
    return userService.getByName(name);
  }
  
}
