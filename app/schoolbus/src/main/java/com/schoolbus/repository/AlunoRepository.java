package com.schoolbus.repository;

import com.schoolbus.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Student, Integer> {

}