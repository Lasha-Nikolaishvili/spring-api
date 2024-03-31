package com.anri.homeowrk.lasha_homework.service;

import com.anri.homeowrk.lasha_homework.dto.FilmDTO;
import com.anri.homeowrk.lasha_homework.entity.Language;
import com.anri.homeowrk.lasha_homework.repository.FilmRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    public Page<FilmDTO> searchFilms(String title, String description, Integer releaseYear,
                                     Language language, Pageable pageable){
        return filmRepository
                .findFilmsByTitleOrDescriptionOrReleaseYearAfterOrLanguage(title,description,releaseYear,language,pageable);
    }
}