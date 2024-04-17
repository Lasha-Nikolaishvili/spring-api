package com.anri.homeowrk.lasha_homework.repository;

import com.anri.homeowrk.lasha_homework.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}