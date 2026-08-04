package com.alumniconnect.service;

import java.util.List;
<<<<<<< HEAD

import com.alumniconnect.entity.Alumni;

public interface AlumniService {

    Alumni addAlumni(Alumni alumni);

    Alumni updateAlumni(Alumni alumni);

    void deleteAlumni(Integer alumniId);

    Alumni getAlumniById(Integer alumniId);

    List<Alumni> getAllAlumni();
=======
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumniconnect.entity.Alumni;
import com.alumniconnect.repository.AlumniRepository;

@Service
public class AlumniService {

    @Autowired
    private AlumniRepository alumniRepository;


    // Get all alumni
    public List<Alumni> getAllAlumni() {
        return alumniRepository.findAll();
    }


    // Get alumni by ID
    public Alumni getAlumniById(Integer id) {
        Optional<Alumni> alumni = alumniRepository.findById(id);

        if(alumni.isPresent()) {
            return alumni.get();
        }

        return null;
    }


    // Add new alumni
    public Alumni saveAlumni(Alumni alumni) {
        return alumniRepository.save(alumni);
    }


    // Update alumni
    public Alumni updateAlumni(Integer id, Alumni alumniDetails) {

        Alumni alumni = alumniRepository.findById(id).orElse(null);

        if(alumni != null) {

            alumni.setName(alumniDetails.getName());
            alumni.setEmail(alumniDetails.getEmail());
            alumni.setMobile(alumniDetails.getMobile());
            alumni.setCompany(alumniDetails.getCompany());
            alumni.setDesignation(alumniDetails.getDesignation());
            alumni.setDepartment(alumniDetails.getDepartment());
            alumni.setGraduationYear(alumniDetails.getGraduationYear());
            alumni.setSkills(alumniDetails.getSkills());
            alumni.setLinkedinProfile(alumniDetails.getLinkedinProfile());

            return alumniRepository.save(alumni);
        }

        return null;
    }


    // Delete alumni
    public void deleteAlumni(Integer id) {
        alumniRepository.deleteById(id);
    }


    // Find alumni by email
    public Alumni getByEmail(String email) {
        return alumniRepository.findByEmail(email);
    }
>>>>>>> branch 'main' of https://github.com/Lohidha/AluminiConnect.git

}