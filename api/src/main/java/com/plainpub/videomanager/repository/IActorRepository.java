package com.plainpub.videomanager.repository;

import com.plainpub.videomanager.dto.Actor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IActorRepository {

    Actor getActor(String id);

    List<Actor> getAllActors();
}
