package com.tianma.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/3/21.
 */
@Controller
@RequestMapping("posts")
public class PostController {
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showCreatePage() {
        return "index";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable long id) {
        return "post";
    }
}
