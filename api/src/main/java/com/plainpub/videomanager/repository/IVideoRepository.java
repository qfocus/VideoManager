package com.plainpub.videomanager.repository;

import com.plainpub.videomanager.dto.Video;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVideoRepository {
    List<Video> getAllVideos();

    List<Video> getVideosByTags(List<Integer> tags);

    //Video get(@Param("id") String id);

    //Video getByTag(@Param("tag_ids") List<String> tagIds);
}
