package com.schoolbus.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("attendant")
public class Attendant extends Person {

    public Attendant() {
    }

    public Attendant(String name, int age, String cpf, 
        String rg, Address addresses) {
        super(name, age, cpf, rg, addresses);
    }
}