package com.schoolbus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int age;
    private String cpf;
    private String rg;
    private String address;

    public Attendant() {
    }

    public Attendant(String name, int age, String cpf, String rg, String address) {
        super();
        setName(name);
        setAge(age);
        setCpf(cpf);
        setRg(rg);
        setAddress(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getAddress() {
        return address;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}