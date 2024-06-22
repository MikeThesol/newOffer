package com.thesol.newoffer.repositories;

import com.thesol.newoffer.models.Card;
import com.thesol.newoffer.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Long> {
    Card findCardById(long id);
    @Query("SELECT v FROM Video v JOIN v.cards c WHERE c.id = :cardId")
    List<Video> findVideosByCardId(@Param("cardId") long cardId);
}
