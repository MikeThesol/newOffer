package com.thesol.newoffer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OfferController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
