package com.anri.homeowrk.lasha_homework.repository;

import com.anri.homeowrk.lasha_homework.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
    Optional<Language> findByNameIgnoreCase(String name);
}
