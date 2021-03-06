package com.schoolbus.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("driver")
public class Driver extends Person {

    private String cnh;

    public Driver() {
    }

    public Driver(String name, int age, String cpf, 
        String rg, Address addresses, String cnh) {
        super(name, age, cpf, rg, addresses);
        setCnh(cnh);
    }

    private void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }
}