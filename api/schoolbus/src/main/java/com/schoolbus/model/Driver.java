package com.schoolbus.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@DiscriminatorValue("driver")
public class Driver extends Person {

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "driver")
    private List<Address> addresses;

    private String cnh;

    public Driver() {
    }

    public Driver(String name, int age, String cpf, 
        String rg, Address addresses, String cnh) {
        super(name, age, cpf, rg);
        this.addresses = new ArrayList<Address>();
        setCnh(cnh);
    }

    private void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setAddresses(List<Address> address) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public String getCnh() {
        return cnh;
    }
}