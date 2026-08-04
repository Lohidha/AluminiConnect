package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.Alumni;

public interface AlumniService {

    Alumni addAlumni(Alumni alumni);

    Alumni updateAlumni(Alumni alumni);

    void deleteAlumni(Integer alumniId);

    Alumni getAlumniById(Integer alumniId);

    List<Alumni> getAllAlumni();

}