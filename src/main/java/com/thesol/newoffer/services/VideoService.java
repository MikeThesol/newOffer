package com.thesol.newoffer.services;

import com.thesol.newoffer.models.Card;
import com.thesol.newoffer.models.Video;
import com.thesol.newoffer.repositories.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final VideoRepository videoRepository;

    public void save(Video video) {
        videoRepository.save(video);
    }

    public List<Video> listVideo() {
        return videoRepository.findAll();
    }

    public Video findById(long id) {
        return videoRepository.findById(id).orElse(null);
    }

    public List<Video> listVideosByCard(long id) {
        return videoRepository.findVideosByCardId(id);
    }
}
