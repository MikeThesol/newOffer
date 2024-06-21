package com.thesol.newoffer.models;

import com.thesol.newoffer.models.enums.Grade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "videos")
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url", length = 1000)
    private String url;

    @Column(name = "post")
    private String post;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "grades", joinColumns = @JoinColumn(name = "video_id"))
    @Enumerated(EnumType.STRING)
    private Set<Grade> grades;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "card_video",
            joinColumns = @JoinColumn(name = "video_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id")
    )
    private List<Card> cards;
}
