package com.plainpub.videomanager.controller;

import com.plainpub.videomanager.dto.Tag;
import com.plainpub.videomanager.service.ITagService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {
    ITagService service;

    @Autowired
    public TagController(ITagService service) {
        this.service = service;
    }

    @GetMapping(value = "/all")
    public List<Tag> getAll() {
        return null;
    }

    @Operation(summary = "Create a new tag.")
    @PostMapping(value = "/{name}")
    public boolean createTag(@PathVariable String name) {
        return true;
    }

}
