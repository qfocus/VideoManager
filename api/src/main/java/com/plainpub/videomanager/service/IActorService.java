package com.plainpub.videomanager.service;

import com.plainpub.videomanager.dto.Actor;

import java.util.List;

public interface IActorService {
    Actor getActor(String id);

    List<Actor> getAll();
}
