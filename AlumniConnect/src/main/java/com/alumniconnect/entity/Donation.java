package com.alumniconnect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "DONATION")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DONATION_ID")
    private Long donationId;

    @ManyToOne
    @JoinColumn(name = "FUND_ID", nullable = false)
    private Fundraising fundraising;

    @ManyToOne
    @JoinColumn(name = "ALUMNI_ID", nullable = false)
    private Alumni alumni;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "DONATION_DATE")
    private LocalDate donationDate;

    @Column(name = "PAYMENT_STATUS")
    private String paymentStatus;
}