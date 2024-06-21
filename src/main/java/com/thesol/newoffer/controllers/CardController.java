package com.thesol.newoffer.controllers;

import com.thesol.newoffer.models.Card;
import com.thesol.newoffer.models.Language;
import com.thesol.newoffer.models.Video;
import com.thesol.newoffer.models.enums.Grade;
import com.thesol.newoffer.repositories.CardRepository;
import com.thesol.newoffer.services.CardService;
import com.thesol.newoffer.services.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;
    private final LanguageService languageService;

    @GetMapping("/language/{name}")
    public String cardSelection(@PathVariable String name, Model model) {
        model.addAttribute("cards", cardService.findByLanguage(languageService.getLanguageByName(name)));
        return "cards-page";
    }

    @GetMapping("/card/{id}")
    public String card(@PathVariable Long id, Model model) {
        model.addAttribute("card", cardService.findCardById(id));
        return "card-answer";
    }

    @GetMapping("/create/card")
    public String createCard(Model model) {
        model.addAttribute("card", new Card());
        model.addAttribute("languages", languageService.listLanguages());
        model.addAttribute("grades", Arrays.stream(Grade.values()).toList());
        return "create-card";
    }

    @PostMapping("/create/card")
    public String saveCard(@RequestParam("title") String title,
                           @RequestParam("description") String description,
                           @RequestParam("language") Long languageId) {

        Card card = new Card();
        Language language = languageService.getLanguageById(languageId);
        card.setTitle(title);
        card.setDescription(description);
        card.setLanguage(language);

        cardService.save(card);
        return "redirect:/";
    }

}
