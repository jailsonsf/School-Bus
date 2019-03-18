package com.schoolbus.repository;

import com.schoolbus.model.EducationalInstitution;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationalInstitutionRepository extends JpaRepository<EducationalInstitution, Integer> {
    
}