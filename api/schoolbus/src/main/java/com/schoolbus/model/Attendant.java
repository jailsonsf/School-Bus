package com.schoolbus.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("attendant")
public class Attendant extends Person {
    
    private String address;

    public Attendant() {
    }

    public Attendant(String name, int age, String cpf, 
        String rg, String address) {
        super(name, age, cpf, rg);
        setAddress(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}