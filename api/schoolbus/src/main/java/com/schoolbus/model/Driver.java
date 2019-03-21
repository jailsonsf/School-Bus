package com.schoolbus.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("driver")
public class Driver extends Person {

    private String address;
    private String cnh;

    public Driver() {
    }

    public Driver(String name, int age, String cpf, 
        String rg, String address, String cnh) {
        super(name, age, cpf, rg);
        setAddress(address);
        setCnh(cnh);
    }

    private void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getCnh() {
        return cnh;
    }
}