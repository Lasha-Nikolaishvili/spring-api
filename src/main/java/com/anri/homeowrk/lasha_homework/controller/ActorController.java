package com.anri.homeowrk.lasha_homework.controller;

import com.anri.homeowrk.lasha_homework.dto.ActorDTO;
import com.anri.homeowrk.lasha_homework.service.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/actor", produces = {"application/json"})
public class ActorController {
    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }
    @GetMapping
    public List<ActorDTO> getAllActors(){
        return actorService.findAll();
    }
}