package com.plainpub.videomanager.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class Tag {
    Integer id;
    String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String createdTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String updatedTime;
}
