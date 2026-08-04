package com.alumniconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alumniconnect.entity.Alumni;
import com.alumniconnect.entity.Student;
import com.alumniconnect.service.AlumniService;
import com.alumniconnect.service.StudentService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private AlumniService alumniService;

    @PostMapping("/student/register")
    public Student registerStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PostMapping("/alumni/register")
    public Alumni registerAlumni(@RequestBody Alumni alumni) {
        return alumniService.addAlumni(alumni);
    }
}