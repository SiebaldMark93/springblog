package com.example.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.ThreadLocalRandom;

@Controller

public class DiceRollController {

    @GetMapping("/roll-dice")
    public String showDiceRoll() {

        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String numberResult(@PathVariable int n, Model vModel) {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);

        if (randomNum == n) {
            vModel.addAttribute("n", n + " Congrats!");
        } else {
            vModel.addAttribute("n", n + " You are wrong!");
        }

        return "roll-dice-results";
    }


}
