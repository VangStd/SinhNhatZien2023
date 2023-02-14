package com.example.sncd_ver1.controller;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/"})
    public String home() {
        return "index";
    }

    @GetMapping("/page2")
    public String page2() {
        return "page2";
    }

    @GetMapping("/page3")
    public String page3() {
        return "page3";
    }
}
