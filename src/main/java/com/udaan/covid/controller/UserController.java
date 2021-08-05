package com.udaan.covid.controller;

import com.udaan.covid.entity.SelfAssessment;
import com.udaan.covid.entity.User;
import com.udaan.covid.service.UserService;
import com.udaan.covid.vo.AssessmentResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public User createUser(@RequestBody User user){
      return  userService.createUser(user);
    }

    @PostMapping("/selfAssessment")
    public AssessmentResult selfAssessment(@RequestBody SelfAssessment selfAssessment){
        return userService.assesUser(selfAssessment);
    }



}
