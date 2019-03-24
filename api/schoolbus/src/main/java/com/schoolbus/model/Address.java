package com.schoolbus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String district;
    private int number;

    @ManyToOne(optional = true)
    @JoinColumn(name = "student_id")
    private Student student;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne(optional = true)
    @JoinColumn(name = "attendant_id")
    private Attendant attendant;

    @ManyToOne(optional = true)
    @JoinColumn(name = "institution_id")
    private EducationalInstitution institution;

    public Address() {}

    public Address(String name, String district, int number) {
        super();
        setName(name);
        setDistrict(district);
        setNumber(number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {

        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getDistrict() {
        return district;
    }

    public String getName() {
        return name;
    }
}