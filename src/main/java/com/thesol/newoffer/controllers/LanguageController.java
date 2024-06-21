package com.thesol.newoffer.controllers;

import com.thesol.newoffer.models.Language;
import com.thesol.newoffer.services.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LanguageController {
    private final LanguageService languageService;

    @GetMapping("/")
    public String languageSelection(Model model) {
        model.addAttribute("languages", languageService.listLanguages());
        return "language-selection";
    }

    @GetMapping("/create/language")
    public String createLanguage() {
        return "create-language";
    }

    @PostMapping("/create/language")
    public String saveLanguage(Language language) {
        languageService.saveLanguage(language);
        return "redirect:/";
    }
}
