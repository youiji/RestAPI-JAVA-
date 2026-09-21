package com.example.student.dto;

import com.example.student.model.Student;


import java.util.List;


public class StudentDto {
    private long id;
    private String name;
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    List<StudentDto> dtoList(List<Student> studentList) {
        return null;
    }
}
