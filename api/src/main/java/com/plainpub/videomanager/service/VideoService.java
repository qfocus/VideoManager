package com.plainpub.videomanager.service;

import com.plainpub.videomanager.dto.Video;
import com.plainpub.videomanager.repository.IVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements IVideoService {
    IVideoRepository repository;

    @Autowired
    public VideoService(IVideoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Video> getAllVideos() {
        return repository.getAllVideos();
    }

    @Override
    public List<Video> getVideosByTags(List<Integer> tags) {
        return repository.getVideosByTags(tags);
    }
}
