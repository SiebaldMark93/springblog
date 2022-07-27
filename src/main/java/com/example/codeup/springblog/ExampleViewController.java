package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ExampleViewController {

    @GetMapping("/helloworld")
    public String returnHello(Model vModel) {
        vModel.addAttribute("name","Mark");
        return "hello-world";
    }

//    @GetMapping("/search")
//    public String returnSearchForm() {
//        return "search";
//    }
//
//    @PostMapping("/search")
//    public String returnSearchResults(@RequestParam String query) {
//        vModel.addAttribute("")
//        return "search-results";
//    }

//    !! Mini-Exercise 1 !!
//
//            1. Create an html file inside of templates called "first-view.html" with an h1 that says "First View"
//            2. Create a controller TestController with a GetMapping method, returnFirstView that returns the first view
//3. Refactor the controller to pass your name to the view and the h1 in the html file to display "First View by YOUR_NAME_HERE"

//    !! Mini-Exercise 2 !!
//
//    Create the needed controller method code inside TestController and html files to allow the user to enter their favorite city in a text input in a form and redirect them to a page displaying their favorite city
//


}
