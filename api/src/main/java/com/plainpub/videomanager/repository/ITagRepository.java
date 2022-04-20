package com.plainpub.videomanager.repository;

import com.plainpub.videomanager.dto.Tag;
import org.apache.ibatis.annotations.Param;

public interface ITagRepository {

    Tag getAll();

    Tag get(@Param("id") String id);

    Boolean create(String name);

    Boolean addToVideo(Integer videoId, Integer tagId);

    Boolean deleteFromVideo(Integer videoId, Integer tagId);

    Boolean addToActor(Integer actor, Integer tagId);

    Boolean deleteFromActor(Integer actor, Integer tagId);
}
