package com.example.student.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name",nullable = false,length = 100)
    private String name;

    @Column(name = "surname",nullable = false,length = 100)
    private String surname;

    private void setId(long id) {
        this.id=id;
    }
    private void setName(String name) {
        this.name=name;
    }
    private void setSurname(String surname) {
        this.surname=surname;
    }
    private String getSurname(String surname) {
        return surname;
    }
}
