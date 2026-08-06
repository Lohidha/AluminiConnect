package com.alumniconnect.serviceimpl;
import com.alumniconnect.repository.StudentRepository;
import com.alumniconnect.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alumniconnect.entity.Certificate;
import com.alumniconnect.exception.ResourceNotFoundException;
import com.alumniconnect.repository.CertificateRepository;
import com.alumniconnect.service.CertificateService;
@Service
public class CertificateServiceImpl implements CertificateService {
    @Autowired
    private CertificateRepository certificateRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Certificate addCertificate(Certificate certificate) {
        Integer studentId = certificate.getStudent().getStudentId();
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        certificate.setStudent(student);
        return certificateRepository.save(certificate);
    }
    @Override
    public Certificate updateCertificate(Certificate certificate) {
        Integer studentId = certificate.getStudent().getStudentId();
        Student student = studentRepository.findById(studentId) .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        certificate.setStudent(student);
        return certificateRepository.save(certificate);
    }
    @Override
    public void deleteCertificate(Integer certificateId) {
        Certificate certificate = certificateRepository.findById(certificateId).orElseThrow(() -> new ResourceNotFoundException("Certificate not found"));
        certificateRepository.delete(certificate);
    }
    @Override
    public Certificate getCertificateById(Integer certificateId) {
        return certificateRepository.findById(certificateId).orElseThrow(() -> new ResourceNotFoundException("Certificate not found"));
    }
    @Override
    public List<Certificate> getCertificatesByStudent(Integer studentId) {
        return certificateRepository.findByStudentStudentId(studentId);
    }
    @Override
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }
}