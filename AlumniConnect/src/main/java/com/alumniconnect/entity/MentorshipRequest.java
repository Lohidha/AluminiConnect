package com.alumniconnect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "MENTORSHIP_REQUEST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MentorshipRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REQUEST_ID")
    private Long requestId;

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "ALUMNI_ID")
    private Alumni alumni;

    @Column(name = "REQUEST_DATE")
    private LocalDate requestDate;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "MEETING_DATE")
    private LocalDate meetingDate;

    @Column(name = "MEETING_LINK")
    private String meetingLink;

    @Column(name = "REMARKS")
    private String remarks;
}