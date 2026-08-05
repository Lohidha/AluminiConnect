package com.alumniconnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alumniconnect.entity.Certificate;
import com.alumniconnect.service.CertificateService;

@RestController
@RequestMapping("/certificate")
@CrossOrigin(origins = "*")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @PostMapping("/add")
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return certificateService.addCertificate(certificate);
    }

    @PutMapping("/update")
    public Certificate updateCertificate(@RequestBody Certificate certificate) {
        return certificateService.updateCertificate(certificate);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCertificate(@PathVariable Integer id) {
        certificateService.deleteCertificate(id);
        return "Certificate deleted successfully";
    }

    @GetMapping("/get/{id}")
    public Certificate getCertificateById(@PathVariable Integer id) {
        return certificateService.getCertificateById(id);
    }

    @GetMapping("/student/{studentId}")
    public List<Certificate> getCertificatesByStudent(@PathVariable Integer studentId) {
        return certificateService.getCertificatesByStudent(studentId);
    }

    @GetMapping("/getall")
    public List<Certificate> getAllCertificates() {
        return certificateService.getAllCertificates();
    }
}