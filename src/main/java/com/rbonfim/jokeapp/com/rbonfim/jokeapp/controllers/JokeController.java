package com.rbonfim.jokeapp.com.rbonfim.jokeapp.controllers;

import com.rbonfim.jokeapp.com.rbonfim.jokeapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {

        model.addAttribute("joke", this.jokeService.getJoke());

        return "joke-view";
    }
}
