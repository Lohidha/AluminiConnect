package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.Student;

public interface StudentService {

    Student addStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(int studentId);

    Student getStudentById(int studentId);

    List<Student> getAllStudents();

}