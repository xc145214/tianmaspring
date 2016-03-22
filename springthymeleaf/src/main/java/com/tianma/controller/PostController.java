package com.tianma.controller;

import com.tianma.exception.PostNotFoundException;
import com.tianma.model.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by Administrator on 2016/3/21.
 */
@Controller
@RequestMapping("/posts")
public class PostController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping(value = "/secret_url", method = RequestMethod.GET)
    public String showCreatePage(HttpSession session) {
        session.setAttribute("root", true);
        return "redirect:/posts/create";
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showCreatePage(Model model, HttpSession session) {
        if(session.getAttribute("root") == null){
            return "redirect:/";
        }
        model.addAttribute("post",new Post());
        return "create";
    }

    /**
     * 无验证
     *
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String create(@RequestParam("title") String title,
                         @RequestParam("content") String content) {
        Data.add(title, content);
        return "createResult";
    }
     */

    /**
     * 有验证
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String create(@Valid Post post, BindingResult result) {
        System.out.println(post.toString());
        if (result.hasErrors()) {
            return "create";
        }
        Data.posts.add(post);
        return "createResult";
    }
     */

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String create(@Valid Post post, BindingResult result) {
        System.out.println(post.toString());
        if (result.hasErrors()) {
            return "create";
        }
        Post p = Data.add(post);
        return "redirect:/posts/" + p.getId();
    }



    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable long id, Model model) {
        model.addAttribute("post", Data.getById(id));
        model.addAttribute("title", "This is a post with id = " + id);
        model.addAttribute("created", "2015-08-11");
        model.addAttribute("content", "This is content");
        return "post";
    }


    // Total control - setup a model and return the view name yourself. Or consider
    // subclassing ExceptionHandlerExceptionResolver (see below).
    @ExceptionHandler(PostNotFoundException.class)
    public ModelAndView handleError(HttpServletRequest req, Exception exception) {
        logger.error("Request: " + req.getRequestURL() + " raised " + exception);

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", exception);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }

}
