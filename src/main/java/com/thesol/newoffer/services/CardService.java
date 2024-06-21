package com.thesol.newoffer.services;

import com.thesol.newoffer.models.Card;
import com.thesol.newoffer.models.Language;
import com.thesol.newoffer.repositories.CardRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;

    public Card findCardById(long id) {
        return cardRepository.findById(id);
    }

    public void save(Card card) {
        cardRepository.save(card);
    }

    public List<Card> findByLanguage(Language language) {
        return cardRepository.findByLanguage(language);
    }
}
