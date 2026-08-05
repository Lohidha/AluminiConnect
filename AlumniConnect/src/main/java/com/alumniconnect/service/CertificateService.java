package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.Certificate;

public interface CertificateService {

    Certificate addCertificate(Certificate certificate);

    Certificate updateCertificate(Certificate certificate);

    void deleteCertificate(Integer certificateId);

    Certificate getCertificateById(Integer certificateId);

    List<Certificate> getCertificatesByStudent(Integer studentId);

    List<Certificate> getAllCertificates();
}