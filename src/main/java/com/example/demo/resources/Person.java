package com.example.demo.resources;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Person {
    @GeneratedValue
    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // public int getId() {
    // return age;
    // }

    // public String getName() {
    // return name;
    // }

    // public void setName(String name) {
    // }

    // public int getAge() {
    // return age;
    // }

    // public void setAge(int age) {
    // }

    public String toString() {
        return name;
    }

}