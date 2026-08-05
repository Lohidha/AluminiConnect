package com.alumniconnect.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CERTIFICATE")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CERTIFICATE_ID")
    private Integer certificateId;

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    @Column(name = "CERTIFICATE_NAME")
    private String certificateName;

    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "ISSUE_DATE")
    private String issueDate;

    @Column(name = "CERTIFICATE_URL")
    private String certificateUrl;

    public Certificate() {
    }

    public Certificate(Integer certificateId, Student student,
                       String certificateName, String organization,
                       String issueDate, String certificateUrl) {
        this.certificateId = certificateId;
        this.student = student;
        this.certificateName = certificateName;
        this.organization = organization;
        this.issueDate = issueDate;
        this.certificateUrl = certificateUrl;
    }

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getCertificateUrl() {
        return certificateUrl;
    }

    public void setCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
    }
}