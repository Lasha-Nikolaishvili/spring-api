package com.anri.homeowrk.lasha_homework.service;

import com.anri.homeowrk.lasha_homework.dto.CityDTO;
import com.anri.homeowrk.lasha_homework.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    public List<CityDTO> findByCity(String city){
        return cityRepository.findAllByCity(city).stream().map(city1 -> new CityDTO(city1.getCity(), city1.getCountry().getCountry())).toList();
    }
}