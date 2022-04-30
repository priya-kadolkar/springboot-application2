package com.dilithe.retailapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String loanNumber;
    private double loanAmount;
    private int loanInterest;
    private String loanType;
    private String status;
}
