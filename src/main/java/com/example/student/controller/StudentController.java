package com.example.student.controller;


import com.example.student.mapper.StudentMapper;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController<studentDto> {
    @Autowired
    private StudentService service;
    @Autowired
    private StudentMapper mapper;


    @GetMapping
    public ResponseEntity<List<studentDto>> getAllStudents() {
        return ResponseEntity.ok(mapper.toDtoList(service.findAll()));
    }

}
