package com.schoolbus.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@DiscriminatorValue("attendant")
public class Attendant extends Person {

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "attendant")
    private List<Address> addresses;

    public Attendant() {
    }

    public Attendant(String name, int age, String cpf, 
        String rg, Address addresses) {
        super(name, age, cpf, rg);
        this.addresses = new ArrayList<Address>();
    }

    public void setAddresses(List<Address> address) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}