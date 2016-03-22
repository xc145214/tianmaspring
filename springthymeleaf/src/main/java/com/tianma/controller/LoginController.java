package com.tianma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/3/22.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        System.out.println(username+ password);
        if ("admin".equals(username) && "password".equals(password)) {
            session.setAttribute("root", true);
        }
        return "redirect:/";
    }

}
