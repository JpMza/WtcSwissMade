package com.wtc.swissmade.swm.models;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

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
    private Date dateStart;

    @Column(name = "identification")
    private String identification;

    @Column(name = "acquirer", columnDefinition = "enum('fullname','denomination','business_name')")
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

    @Column(name = "IVA")
    private String iva;

    @Column(name = "iva_perceptions")
    private String ivaPerceptions;

    @Column(name = "other_perceptions")
    private String otherPerceptions;

    @Column(name = "iva_concepts_not_recorded")
    private String iva_concepts;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "amount_recived")
    private BigDecimal amountRecived;

    @Column(name = "expiration_date")
    private Date expirationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getBussiness_name() {
        return bussiness_name;
    }

    public void setBussiness_name(String bussiness_name) {
        this.bussiness_name = bussiness_name;
    }

    public String getCommercialAddress() {
        return commercialAddress;
    }

    public void setCommercialAddress(String commercialAddress) {
        this.commercialAddress = commercialAddress;
    }

    public String getFiscalAddress() {
        return fiscalAddress;
    }

    public void setFiscalAddress(String fiscalAddress) {
        this.fiscalAddress = fiscalAddress;
    }

    public String getRegisteredManager() {
        return registeredManager;
    }

    public void setRegisteredManager(String registeredManager) {
        this.registeredManager = registeredManager;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getUtilTimestamp() {
        return utilTimestamp;
    }

    public void setUtilTimestamp(Date utilTimestamp) {
        this.utilTimestamp = utilTimestamp;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public int getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(int grossIncome) {
        this.grossIncome = grossIncome;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getAcquirer() {
        return acquirer;
    }

    public void setAcquirer(String acquirer) {
        this.acquirer = acquirer;
    }

    public String getAcquirerCommercialAddress() {
        return acquirerCommercialAddress;
    }

    public void setAcquirerCommercialAddress(String acquirerCommercialAddress) {
        this.acquirerCommercialAddress = acquirerCommercialAddress;
    }

    public int getAcquirer_cuit() {
        return acquirer_cuit;
    }

    public void setAcquirer_cuit(int acquirer_cuit) {
        this.acquirer_cuit = acquirer_cuit;
    }

    public String getAcquirerRegisteredManager() {
        return acquirerRegisteredManager;
    }

    public void setAcquirerRegisteredManager(String acquirerRegisteredManager) {
        this.acquirerRegisteredManager = acquirerRegisteredManager;
    }

    public int getReferNumber() {
        return referNumber;
    }

    public void setReferNumber(int referNumber) {
        this.referNumber = referNumber;
    }

    public String getCuantity() {
        return cuantity;
    }

    public void setCuantity(String cuantity) {
        this.cuantity = cuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAliquot() {
        return aliquot;
    }

    public void setAliquot(String aliquot) {
        this.aliquot = aliquot;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getIvaPerceptions() {
        return ivaPerceptions;
    }

    public void setIvaPerceptions(String ivaPerceptions) {
        this.ivaPerceptions = ivaPerceptions;
    }

    public String getOtherPerceptions() {
        return otherPerceptions;
    }

    public void setOtherPerceptions(String otherPerceptions) {
        this.otherPerceptions = otherPerceptions;
    }

    public String getIva_concepts() {
        return iva_concepts;
    }

    public void setIva_concepts(String iva_concepts) {
        this.iva_concepts = iva_concepts;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getAmountRecived() {
        return amountRecived;
    }

    public void setAmountRecived(BigDecimal amountRecived) {
        this.amountRecived = amountRecived;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
