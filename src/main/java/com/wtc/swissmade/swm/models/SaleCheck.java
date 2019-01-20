package com.wtc.swissmade.swm.models;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.DateFormat;

@Entity(name = "SaleCheck")
@Table(name = "SalesChecks")
public class SaleCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fantasy_name")
    private String fantasyName;

    @Column(name = "business_name")
    private String bussiness_name;

    @Column(name = "comercial_address")
    private String commercialAddress;

    @Column(name = "fiscal_address")
    private String fiscalAddress;

    @Column(name = "registered_manager")
    private String registeredManager;

    @Column(name = "number")
    private int number;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date utilTimestamp;

    @Column(name = "cit")
    private String cuit;

    @Column(name = "gross_income")
    private int grossIncome;

    @Column(name = "activity_start")
    private DateFormat dateStart;

    @Column(name = "identification")
    private String identification;

    @Column(name = "acquirer", columnDefinition = "enum,('Fullname','denomination','business_name')")
    private String acquirer;

    @Column(name = "acquirer_comercial_address")
    private String acquirerCommercialAddress;

    @Column(name = "acquirer_cuit")
    private int acquirer_cuit;

    @Column(name = "acquirer_registered_manager")
    private String acquirerRegisteredManager;

    @Column(name = "refer_number")
    private int referNumber;

    @Column(name = "cuantity")
    private String cuantity;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "aliquot")
    private String aliquot;

}
