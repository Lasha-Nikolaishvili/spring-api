package com.anri.homeowrk.lasha_homework.repository;

import com.anri.homeowrk.lasha_homework.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
