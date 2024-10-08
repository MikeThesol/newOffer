package com.thesol.newoffer.repositories;

import com.thesol.newoffer.models.Card;
import com.thesol.newoffer.models.Language;
import com.thesol.newoffer.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    Card findById(long id);
    List<Card> findByLanguage(Language language);
    Video findVideoById(long id);
    @Transactional
    @Modifying
    @Query("UPDATE Card c SET c.description = :description WHERE c.id = :id")
    void updateDescriptionById(@Param("id") long id, @Param("description") String description);
}
