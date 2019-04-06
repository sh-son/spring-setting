package com.son.mvcboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    public String  hmoe(Model model) {
        model.addAttribute("greeting", "Hello World");
        return "home";
    }
}
