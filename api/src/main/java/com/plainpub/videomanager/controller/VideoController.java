package com.plainpub.videomanager.controller;


import com.plainpub.videomanager.dto.Video;
import com.plainpub.videomanager.service.IVideoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/video")
public class VideoController {
    IVideoService service;

    public VideoController(@Autowired IVideoService repository) {
        this.service = repository;
    }

    @GetMapping(value = "/all")
    public List<Video> getAll() {
        return service.getAllVideos();
    }

    @GetMapping(value = "/all/{tags}")
    public List<Video> getAllByTags(@PathVariable List<Integer> tags) {
        return service.getVideosByTags(tags);
    }

    @GetMapping(value = "/{id}")
    public List<Video> getDetails(@PathVariable Integer id) {
        return new ArrayList<>();
    }

    @Operation(summary = "Add tag to video")
    @PostMapping(value = "/tag/{videoId}/{tagId}")
    public boolean addTag(@PathVariable String videoId, @PathVariable String tagId) {
        return true;
    }

    @Operation(summary = "Add tag to video")
    @DeleteMapping(value = "/tag/{videoId}/{tagId}")
    public boolean deleteTag(@PathVariable String videoId, @PathVariable String tagId) {
        return true;
    }

    @Operation(summary = "Add actor to video")
    @PostMapping(value = "/cast/{videoId}/{actorId}")
    public boolean addCast(@PathVariable String videoId, @PathVariable String actorId) {
        return true;
    }

    @Operation(summary = "Add actor to video")
    @DeleteMapping(value = "/cast/{videoId}/{actorId}")
    public boolean deleteCast(@PathVariable String videoId, @PathVariable String actorId) {
        return true;
    }
}
