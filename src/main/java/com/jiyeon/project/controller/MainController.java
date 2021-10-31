package com.jiyeon.project.controller;

import com.jiyeon.project.domain.User;
import com.jiyeon.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/main/{id}")
    public ModelAndView main(@PathVariable("id") String id){

        List<User> userList = userService.findByUserId(Long.parseLong(id));
        ModelAndView mv = new ModelAndView();

        mv.addObject("name", userList.get(0).getName());

        System.out.println(userList.get(0).getUserId());
        System.out.println("------user ----id -----");

        System.out.println(userList.get(0).getName());
        System.out.println("------user ----name -----");

        mv.setViewName("/main.html");

        return mv;
    }
}
