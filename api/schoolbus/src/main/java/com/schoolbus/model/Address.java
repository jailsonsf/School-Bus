package com.schoolbus.model;


public class Address {

    private String name;
    private String bairro;
    private int number;

    public Address() {}

    public Address(String name, String bairro, int number) {
        super();
        setName(name);
        setBairro(bairro);
        setNumber(number);
    }

    public String getAddress() {
        return name + ", " + bairro + ", " + number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getBairro() {
        return bairro;
    }

    public String getName() {
        return name;
    }
}