package com.example.student.mapper;

import com.example.student.dto.StudentDto;
import com.example.student.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentMapper {
    public StudentDto toDto(Student student) {
        return new StudentDto(student.getId(), student.getName(), student.getSurname());
    }

    public List<StudentDto> toDtoList(List<Student> students) {
        return students.stream().map(this::toDto).toList();
    }

    public Student toEntity(StudentDto dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setSurname(dto.getSurname());
        return student;
    }
}
