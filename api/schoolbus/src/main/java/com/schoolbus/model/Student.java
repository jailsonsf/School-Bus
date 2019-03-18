package com.schoolbus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int age;
    private String cpf;
    private String rg;
    private String address;
    private String course;
    private String classTime;

    public Student() {
    }

    public Student(String name, int age, String cpf, String rg, String address, String course, String classTime) {
        super();
        setName(name);
        setAge(age);
        setCpf(cpf);
        setRg(rg);
        setAddress(address);
        setCourse(course);
        setClassTime(classTime);
    }

    public Integer getId() {

        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}