package com.anri.homeowrk.lasha_homework.service;

import com.anri.homeowrk.lasha_homework.dto.ActorDTO;
import com.anri.homeowrk.lasha_homework.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }
    public List<ActorDTO> findAll(){
        return actorRepository.findAll().stream()
                .map(actor -> new ActorDTO(actor.getFirstName(),actor.getLastName())).toList();
    }
}