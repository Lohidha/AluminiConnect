package com.alumniconnect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "FUNDRAISING")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fundraising {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FUND_ID")
    private Long fundId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TARGET_AMOUNT")
    private BigDecimal targetAmount;

    @Column(name = "COLLECTED_AMOUNT")
    private BigDecimal collectedAmount;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "STATUS")
    private String status;
}