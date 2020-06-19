package com.jenkins.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/jenkins")

public class BaesController {

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    @ResponseBody
    public String login() {
        return "来了！老弟!";
    }


}