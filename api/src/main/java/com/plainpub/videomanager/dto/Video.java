package com.plainpub.videomanager.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class Video {
    Integer id;
    String name;
    String path;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String createdTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String updatedTime;
    List<Tag> tags;
    List<Actor> actors;
    String cover;
    List<Rating> ratings;
}
