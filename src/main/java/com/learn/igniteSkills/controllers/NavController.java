package com.learn.igniteSkills.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class NavController {
        @GetMapping("/register")
        public String register() {
                return "register";
        }

        @GetMapping("/login")
        public String login() {
                return "login";
        }

        @GetMapping("/addCourse")
        public String addCourse() {
                return "addCourse";
        }

        @GetMapping("/addLesson")
        public String addLesson() {
                return "addLesson";
        }
}
