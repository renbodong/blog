package com.zq.blogbusinessweb.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/11/13 22:20
 */
@RestController
@RequestMapping("/")
public class DemoController {
    @RequestMapping(value = "test",method = RequestMethod.POST)
    public String test(@PathVariable("name") String name){
        return "1";
    }
}
