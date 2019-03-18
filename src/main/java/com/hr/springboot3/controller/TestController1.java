package com.hr.springboot3.controller;

import com.hr.springboot3.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test1")
public class TestController1 {

    @RequestMapping("/index1")
    public ModelAndView index1(){
        ModelAndView mv=new ModelAndView("/thPage");

        mv.addObject("name","小张");
        //模拟查询结果
        List<User> userList=new ArrayList<>();
        userList.add(new User(1,"小张","男",18));
        userList.add(new User(2,"小李","女",16));
        userList.add(new User(3,"小赵","女",20));
        userList.add(new User(4,"小王","男",22));

        mv.addObject("userList",userList);
        return mv;
    }
}
