package com.tianma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/3/21.
 */
@Controller
public class IndexController {

//    @RequestMapping(value = "/",method = RequestMethod.GET)
//    @ResponseBody
//    public String index() {
//        return "index";
//    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "<html><head><title>Hello World!</title></head><body><h1>Hello World!</h1><p>This is my first controller site</p></body></html>";
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("posts", Data.posts);
        return "index";
    }


}