package com.plainpub.videomanager.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class Rating {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Integer id;
    Integer rating;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String ratingTime;
}
