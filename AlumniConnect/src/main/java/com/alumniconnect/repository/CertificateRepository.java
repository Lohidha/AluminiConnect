package com.alumniconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumniconnect.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer> {

    List<Certificate> findByStudentStudentId(Integer studentId);

}