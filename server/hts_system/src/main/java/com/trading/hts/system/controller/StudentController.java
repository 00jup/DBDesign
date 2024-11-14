package com.trading.hts.system.controller;

// StudentController.java

import com.trading.hts.system.model.Student;
import com.trading.hts.system.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students/major/{major}")
    public List<Student> getStudentsByMajor(@PathVariable String major) {
        return studentRepository.findByMajor(major);
    }

    @GetMapping("/students/name/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name) {
        return studentRepository.findByName(name)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}