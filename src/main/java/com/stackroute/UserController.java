package com.stackroute;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
        User user=new User("welcome to stackroute");
        @GetMapping("/*")
        public ModelAndView hello(){
        //String result=httpServletRequest.getParameter(user.getName());
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("result",user.getName());
        return modelAndView;
    }
}
