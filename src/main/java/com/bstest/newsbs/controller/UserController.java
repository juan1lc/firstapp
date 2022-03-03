package com.bstest.newsbs.controller;

import com.bstest.newsbs.service.UserService;
import com.bstest.newsbs.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    //依赖注入
     UserService userService;

    @GetMapping("/")
    List<UserVo> list(){
        return null;
    }

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }
}
