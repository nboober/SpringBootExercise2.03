package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/application")
    public String loadFormPage(Model model) {
        model.addAttribute("info", new Application());
        return "application";
    }

    @PostMapping("/application")
    public String loadFromPage(@ModelAttribute Application info, Model model){
        model.addAttribute("info", info);
        return "confirmApplication";
    }

}
