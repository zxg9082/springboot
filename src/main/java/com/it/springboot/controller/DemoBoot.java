package com.it.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoBoot {

    @RequestMapping("/demo")
    @ResponseBody
    public String getString(){
        return "123";
    }

    @RequestMapping("/demofreemarker")
    public String showPage(Model model) {
        model.addAttribute("hello","hello world ,i am wellcome");
        return "hello";
    }
}
