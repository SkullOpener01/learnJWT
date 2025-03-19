package com.volkmatrix.learnjwt.controller;

import com.volkmatrix.learnjwt.services.UserService;
import com.volkmatrix.learnjwt.services.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

  @Autowired
  private UserService userService;
  public String welcome(){
    return "This is a private page. \nthis page is not allowed to unauthenticated users.";
  }

  @GetMapping("/users")
  public List<Users> users(){
    System.out.println("getting users ");
    return userService.getUsers();
  }

  @GetMapping("/current_user")
  public String getLoggedInUser(Principal principal){
    return principal.getName();
  }
}
