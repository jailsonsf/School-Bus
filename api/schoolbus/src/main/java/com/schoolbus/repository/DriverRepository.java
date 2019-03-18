package com.schoolbus.repository;

import com.schoolbus.model.Driver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
    
}