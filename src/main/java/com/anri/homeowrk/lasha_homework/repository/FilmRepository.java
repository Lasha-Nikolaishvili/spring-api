package com.anri.homeowrk.lasha_homework.repository;

import com.anri.homeowrk.lasha_homework.dto.FilmDTO;
import com.anri.homeowrk.lasha_homework.entity.Film;
import com.anri.homeowrk.lasha_homework.entity.Language;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
    Page<FilmDTO> findFilmsByTitleOrDescriptionOrReleaseYearAfterOrLanguage(String title,
                                                                            String description,
                                                                            Integer releaseYear,
                                                                            Language language,
                                                                            Pageable pageable);
}