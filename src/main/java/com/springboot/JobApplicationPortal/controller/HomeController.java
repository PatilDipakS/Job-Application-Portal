package com.springboot.JobApplicationPortal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {
	
    @GetMapping("/")
    public String home() {
        return "HTMLPages/apply-job.html"; // Looks for index.html in templates/
    }
    
//    @PostMapping("/save")
//    public String saveData() {
//        return "HTMLPages/apply-job.html"; // Looks for index.html in templates/
//    }
//    

}
