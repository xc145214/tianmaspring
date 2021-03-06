package com.tianma.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Optional;

/**
 * Created by Administrator on 2016/3/22.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(@RequestParam("next") Optional<String> next) {
        return "login";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        @RequestParam("next") Optional<String> next,
                        HttpSession session,Model model) {

        logger.info("next = {}",next.orElse("/"));

        if ("admin".equals(username) && "password".equals(password)) {
            logger.info("login sucessfully");
            session.setAttribute("root", true);
            return "redirect:".concat(next.orElse("/"));
        }
        model.addAttribute("fail",true);
        return "login";
    }

}
