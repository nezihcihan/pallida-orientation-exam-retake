package com.greenfox.retake.exam.controllers;

import com.greenfox.retake.exam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/warehouse")
    public String list(Model model) {

        model.addAttribute("products", productRepository.findAll());
        return "index";
    }


}
