package com.thesol.newoffer.repositories;

import com.thesol.newoffer.models.Card;
import com.thesol.newoffer.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    Card findById(long id);
    List<Card> findByLanguage(Language language);
}
