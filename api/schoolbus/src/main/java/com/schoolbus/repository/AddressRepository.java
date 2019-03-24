package com.schoolbus.repository;

import com.schoolbus.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    
}