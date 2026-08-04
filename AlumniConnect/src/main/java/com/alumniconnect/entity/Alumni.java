package com.alumniconnect.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ALUMNI")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Alumni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ALUMNI_ID")
    private Integer alumniId;

    @Column(name = "REGISTER_NO", nullable = false, unique = true)
    private String registerNo;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "BATCH")
    private String batch;

    @Column(name = "CURRENT_COMPANY")
    private String currentCompany;

    @Column(name = "DESIGNATION")
    private String designation;

    @Column(name = "EXPERIENCE")
    private Integer experience;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "SKILLS")
    private String skills;

    @Column(name = "LINKEDIN")
    private String linkedin;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "AVAILABLE_FOR_MENTORSHIP")
    private String availableForMentorship;
    
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
}