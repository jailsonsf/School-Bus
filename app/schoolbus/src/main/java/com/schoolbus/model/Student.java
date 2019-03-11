package com.schoolbus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String course;
    private String classTime;

    public Student(String name, int age, String cpf, String rg, String address, String course, String classTime) {
        super(name, age, cpf, rg, address);
        setCourse(course);
        setClassTime(classTime);
    }

    private void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    private void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public String getClassTime() {
        return classTime;
    }
}