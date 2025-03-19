package com.volkmatrix.learnjwt.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

private List<Users> users = new ArrayList<>();

public UserService() {
  users.add(new Users(UUID.randomUUID().toString(),"pankaj","pankaj@gmail.com"));
  users.add(new Users(UUID.randomUUID().toString(),"harsh","harsh@gmail.com"));
  users.add(new Users(UUID.randomUUID().toString(),"ankit","ankit@gmail.com"));
  users.add(new Users(UUID.randomUUID().toString(),"gautam","gautum@gmail.com"));
  users.add(new Users(UUID.randomUUID().toString(),"arjun singh","arjun@gmail.com"));
}

public List<Users> getUsers() {
  return this.users;
}
}
