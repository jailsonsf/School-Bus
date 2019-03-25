package com.schoolbus.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("student")
public class Student extends Person {

    private String address;
    private String course;
    private String classTime;

    public Student() {
    }

    public Student(String name, int age, String cpf, String rg, String address, String course, String classTime) {
        super(name, age, cpf, rg);
        setAddress(address);
        setCourse(course);
        setClassTime(classTime);
    }

    public Integer getId() {

        return super.getId();
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
        super.setId(id);
    }
}