package com.plainpub.videomanager.service;

import com.plainpub.videomanager.dto.Actor;
import com.plainpub.videomanager.repository.IActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService implements IActorService {

    IActorRepository repository;

    @Autowired
    public ActorService(IActorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Actor getActor(String id) {
        return repository.getActor(id);
    }

    @Override
    public List<Actor> getAll() {
        return repository.getAllActors();
    }
}
