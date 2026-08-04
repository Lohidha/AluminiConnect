package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.Alumni;

public interface AlumniService {

    Alumni addAlumni(Alumni alumni);

    Alumni updateAlumni(Alumni alumni);

    void deleteAlumni(int alumniId);

    Alumni getAlumniById(int alumniId);

    List<Alumni> getAllAlumni();

    Alumni getAlumniByEmail(String email);

}