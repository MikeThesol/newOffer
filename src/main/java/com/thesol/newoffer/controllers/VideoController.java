package com.thesol.newoffer.controllers;

import com.thesol.newoffer.models.Video;
import com.thesol.newoffer.models.enums.Grade;
import com.thesol.newoffer.services.CardService;
import com.thesol.newoffer.services.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequiredArgsConstructor
public class VideoController {
    private final CardService cardService;
    private final VideoService videoService;

    @GetMapping("/create/video")
    public String createVideo(Model model) {
        model.addAttribute("grades", Grade.values());
        return "create-video";
    }

    @GetMapping("/interview")
    public String interview(Model model) {
        model.addAttribute("videos", videoService.listVideo());
        return "interviews";
    }



    @PostMapping("/create/video")
    public String saveVideo(@RequestParam("url") String url,
                            @RequestParam("post") String post,
                            @RequestParam("grade") String grade,
                            @RequestParam("card_id") long id) {

        Video video = new Video();
        video.setUrl(url);
        video.setPost(post);
        video.getGrades().add(convertToGrade(grade));
        video.getCards().add(cardService.findCardById(id));
        videoService.save(video);
        return "redirect:/";
    }

    private Grade convertToGrade(String grade) {
        if (grade != null) {
            if(grade.equalsIgnoreCase("junior")) {
                return Grade.JUNIOR;
            } else if(grade.equalsIgnoreCase("middle")) {
                return Grade.MIDDLE;
            } else if(grade.equalsIgnoreCase("senior")) {
                return Grade.SENIOR;
            } else if(grade.equalsIgnoreCase("lead")) {
                return Grade.LEAD;
            }
        }
        return null;
    }
}
