package com.wtc.swissmade.swm.models;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Entity(name = "product")
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "price", precision = 20, scale = 2)
    @NotNull(message = "Por favor intgrese un precio")
    private BigDecimal price;

    @Column(name = "weight")
    private int weight;

    @Column(name = "diameter")
    private int diameter;

    @Column(name = "width")
    private int width;

    @Column(name = "movement_type", columnDefinition = "enum('mechanic','automatic','quartz','digital')")
    private String movementType;

    @Column(name ="box_type")
    private String boxType;

    @Column(name = "cristal_type")
    private String cristalType;

    @Column(name =  "band_type")
    private String bandType;

    @Column(name = "manufacturer")
    private String productManufacturer;

    @Column(name = "description")
    private String productDescription;

    @Column(name = "unit")
    private String unitStock;

    @Transient
    private MultipartFile productImage;

    @Column(name = "created_at", nullable = true, columnDefinition="DATETIME")
    private String created_at;

    @Column(name = "updated_at", nullable = true, columnDefinition="DATETIME")
    private String updated_at;

    @Column(name = "deleted_at", nullable = true, columnDefinition="DATETIME")
    private String deleted_at;

    @Column(name = "active", columnDefinition = "int default 1")
    private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    public String getCristalType() {
        return cristalType;
    }

    public void setCristalType(String cristalType) {
        this.cristalType = cristalType;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getBandType() {
        return bandType;
    }

    public void setBandType(String bandType) {
        this.bandType = bandType;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getUnitStock() {
        return unitStock;
    }

    public void setUnitStock(String unitStock) {
        this.unitStock = unitStock;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    @PrePersist
    public void setLastCreate() {
        final Date dateNow = new Date();
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.setCreated_at(sdf.format(dateNow));
        this.setUpdated_at(sdf.format(dateNow));
    }

    @PreUpdate
    public void setLastUpdate() {
        final Date dateNow = new Date();
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        this.setUpdated_at(sdf.format(dateNow));
    }
}
