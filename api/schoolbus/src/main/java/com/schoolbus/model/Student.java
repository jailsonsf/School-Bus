package com.schoolbus.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@DiscriminatorValue("student")
public class Student extends Person {

    private String course;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Address> addresses;

    @JsonBackReference
    @ManyToOne(optional = true)
    @JoinColumn(name = "institution_id")
    private EducationalInstitution institution;

    public Student() {
    }

    public Student(String name, int age, String cpf, String rg, 
        Address addresses, String course) {
        super(name, age, cpf, rg);
        this.addresses = new ArrayList<Address>();
        setCourse(course);
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAddresses(List<Address> address) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public String getCourse() {
        return course;
    }
}