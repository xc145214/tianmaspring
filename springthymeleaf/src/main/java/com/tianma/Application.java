package com.tianma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/3/21.
 */
@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/home")
    String home(){
        return "<html><head><title>Hello World!</title></head><body><h1>Hello World!</h1><p>This is my first web site</p></body></html>";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
