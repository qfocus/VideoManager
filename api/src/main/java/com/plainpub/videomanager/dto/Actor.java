package com.plainpub.videomanager.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;


@Data
public class Actor {
    @Schema(hidden = true)
    Integer id;
    String name;
    String alias;
    List<Rating> ratings;
}
