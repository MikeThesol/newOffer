package com.thesol.newoffer.services;

import com.thesol.newoffer.models.Card;
import com.thesol.newoffer.models.Language;
import com.thesol.newoffer.repositories.LanguageRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class LanguageService {
    private final LanguageRepository languageRepository;

    public List<Language> listLanguages() {
        return languageRepository.findAll();
    }

    public List<Card> listCards() {
        List<Language> languages = listLanguages();
        List<Card> cards = new ArrayList<>();
        for (Language language : languages) {
            cards.add((Card) language.getCards());
        }
        return cards;
    }

    public void saveLanguage(Language language) {
        languageRepository.save(language);
    }

    public Language getLanguageById(long id) {
        return languageRepository.findById(id);
    }

    public Language getLanguageByName(String name) {
        return languageRepository.findByName(name);
    }
}
