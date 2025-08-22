package com.tka.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int stud_id;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    private String name;

    public Student() {
        super();
    }

    private String city;

    public Student(int stud_id, String name, String city) {
        this.stud_id = stud_id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stud_id=" + stud_id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
