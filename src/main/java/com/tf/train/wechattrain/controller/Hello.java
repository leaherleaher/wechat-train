package com.tf.train.wechattrain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(value="/hello")
    public String hello(){
        return "hello";
    }
}