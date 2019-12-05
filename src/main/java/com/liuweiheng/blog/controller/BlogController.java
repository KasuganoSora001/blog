package com.liuweiheng.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping(value = "/category")
    public String category(){
        return "category";
    }

    @GetMapping(value="/archives")
    public String archives(){
        return "archives";
    }

    @GetMapping(value="/about")
    public String about(){
        return "about";
    }
    @GetMapping(value="/admin/index")
    public String indexAdmin(){
        return "admin/index-admin";
    }

}
