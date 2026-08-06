package com.alumniconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alumniconnect.entity.Admin;
import com.alumniconnect.entity.Alumni;
import com.alumniconnect.entity.LoginRequest;
import com.alumniconnect.entity.LoginResponse;
import com.alumniconnect.entity.Student;
import com.alumniconnect.repository.AdminRepository;
import com.alumniconnect.repository.AlumniRepository;
import com.alumniconnect.repository.StudentRepository;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins="*")
public class AuthController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AlumniRepository alumniRepository;

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        Student student = studentRepository.findByEmail(request.getEmail());

        if (student != null && student.getPassword().equals(request.getPassword())) {
            return new LoginResponse("student", student);
        }

        Alumni alumni = alumniRepository.findByEmail(request.getEmail());

        if (alumni != null && alumni.getPassword().equals(request.getPassword())) {
            return new LoginResponse("alumni", alumni);
        }

        Admin admin = adminRepository.findByEmail(request.getEmail());

        if (admin != null && admin.getPassword().equals(request.getPassword())) {
            return new LoginResponse("admin", admin);
        }

        throw new RuntimeException("Invalid Email or Password");
    }
}