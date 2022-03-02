package com.bstest.newsbs.controller;

import com.bstest.newsbs.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DefaultController {

    @GetMapping
    public String sayhello(){

        return "欢迎欢迎";
    }

}
