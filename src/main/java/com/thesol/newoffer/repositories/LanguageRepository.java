package com.thesol.newoffer.repositories;

import com.thesol.newoffer.models.Card;
import com.thesol.newoffer.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language, Long> {
    Language findById(long id);
    Language findByName(String name);
}
