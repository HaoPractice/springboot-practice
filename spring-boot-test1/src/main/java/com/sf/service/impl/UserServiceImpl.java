package com.sf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.mapper.UserMapper;
import com.sf.model.User;
import com.sf.model.UserExample;
import com.sf.service.UserService;
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper userMapper;

  @Override
  public User getUserById(Integer id) {
    return userMapper.selectByPrimaryKey(id);
  }

  @Override
  public int deleteById(Integer id) {
    userMapper.deleteByPrimaryKey(id);
    return 0;
  }

  @Override
  public void insert(User user) {
    userMapper.insert(user);
  }

  @Override
  public void batchInsert(List<User> users) {
    userMapper.batchInsert(users);
  }

  @Override
  public List<User> getByName(String username) {
    UserExample example = new UserExample();
    example.createCriteria().andUsernameLike("%hao%");
    return userMapper.selectByExample(example);
  }

}
