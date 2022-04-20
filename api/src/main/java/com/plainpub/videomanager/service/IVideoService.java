package com.plainpub.videomanager.service;

import com.plainpub.videomanager.dto.Video;

import java.util.List;

public interface IVideoService {
    List<Video> getAllVideos();

    List<Video> getVideosByTags(List<Integer> tags);
}
