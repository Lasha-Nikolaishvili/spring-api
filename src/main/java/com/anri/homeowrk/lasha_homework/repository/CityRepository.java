package com.anri.homeowrk.lasha_homework.repository;

import com.anri.homeowrk.lasha_homework.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    List<City> findAllByCity(String city);
}