package com.anri.homeowrk.lasha_homework.repository;

import com.anri.homeowrk.lasha_homework.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @NonNull
    Page<Customer> findAll(@NonNull Pageable pageable);
}