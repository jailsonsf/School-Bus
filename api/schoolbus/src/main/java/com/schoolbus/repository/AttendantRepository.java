package com.schoolbus.repository;

import com.schoolbus.model.Attendant;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendantRepository extends JpaRepository<Attendant, Integer> {
    
}