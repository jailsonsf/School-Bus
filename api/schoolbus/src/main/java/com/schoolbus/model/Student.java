package com.schoolbus.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@DiscriminatorValue("student")
public class Student extends Person {

    private String course;

    @JsonBackReference
    @ManyToOne(optional = true)
    @JoinColumn(name = "institution_id")
    private EducationalInstitution institution;

    public Student() {
    }

    public Student(String name, int age, String cpf, String rg, 
        Address addresses, String course) {
        super(name, age, cpf, rg, addresses);
        setCourse(course);
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}