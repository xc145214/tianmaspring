package com.tianma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Administrator on 2016/3/22.
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping(method = GET)
    public String upload() {
        return "upload";
    }
}