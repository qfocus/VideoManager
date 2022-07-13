
package com.plainpub.videomanager.controller;

import com.plainpub.videomanager.dto.Actor;
import com.plainpub.videomanager.dto.Tag;
import com.plainpub.videomanager.service.IActorService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    IActorService service;

    @Autowired
    public ActorController(IActorService service) {
        this.service = service;
    }

    @GetMapping(value = "/all")
    public List<Actor> getAll() {
        return service.getAll();
    }

    @Operation(summary = "Create a new actor.")
    @PostMapping()
    public boolean createActor(@RequestBody Actor actor) {
        return true;
    }

    @Operation(summary = "Get actor detail.")
    @GetMapping("/{id}")
    public Actor getActor(@PathVariable String id) {
        return service.getActor(id);
    }

    @Operation(summary = "Create a new actor.")
    @PostMapping("/{actorId}/{rating}")
    public boolean rateActor(@PathVariable String actorId, @PathVariable int rating) {
        return true;
    }
}
