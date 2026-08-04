package com.alumniconnect.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumniconnect.entity.Alumni;
import com.alumniconnect.exception.ResourceNotFoundException;
import com.alumniconnect.repository.AlumniRepository;
import com.alumniconnect.service.AlumniService;

@Service
public class AlumniServiceImpl implements AlumniService {

    @Autowired
    private AlumniRepository alumniRepository;

    @Override
    public Alumni addAlumni(Alumni alumni) {
        return alumniRepository.save(alumni);
    }

    @Override
    public Alumni updateAlumni(Alumni alumni) {
        return alumniRepository.save(alumni);
    }

    @Override
    public void deleteAlumni(int alumniId) {
        alumniRepository.deleteById(alumniId);
    }

    @Override
    public Alumni getAlumniById(int alumniId) {
        return alumniRepository.findById(alumniId)
                .orElseThrow(() -> new ResourceNotFoundException("Alumni not found"));
    }

    @Override
    public List<Alumni> getAllAlumni() {
        return alumniRepository.findAll();
    }

}