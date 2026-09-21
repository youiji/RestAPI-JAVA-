package com.example.student.mapper;

import com.example.student.dto.StudentDto;
import com.example.student.model.Student;

import java.util.List;

public class StudentMapper {
    public <studentDto> List<studentDto> toDtoList(List<Student> all) {
        StudentDto dto=new

        return dto;
    }
}
