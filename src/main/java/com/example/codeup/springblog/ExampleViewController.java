package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ExampleViewController {

    @GetMapping("/helloworld")
    public String returnHello(Model vModel) {
        vModel.addAttribute("name","Mark");
        return "hello-world";
    }

}
