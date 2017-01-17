package com.sf.service;

import java.util.List;

import com.sf.model.User;

public interface UserService {
  User getUserById(Integer id);
  int deleteById(Integer id);
  void insert(User user);
  void batchInsert(List<User> user);
  List<User> getByName(String username);
}
