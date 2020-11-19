package com.alimotie.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Phone")
public class Phone {
    
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Valid")
    private Boolean valid;

    @Column(name = "Localformat")
    private String localFormat;

    @Column(name = "Intlformat")
    private String intlFormat;

    @Column(name = "countrycode")
    private String countryCode;

    @Column(name = "Countryname")
    private String countryName;

    @Column(name = "location")
    private String location;

    @Column(name = "carrier")
    private String carrier;

    @Column(name = "linetype")
    private LineType lineType;


    public Phone(Boolean valid, String localFormat, String intlFormat, String countryCode, String countryName, String location, String carrier, LineType lineType) {
        this.valid = valid;
        this.localFormat = localFormat;
        this.intlFormat = intlFormat;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.location = location;
        this.carrier = carrier;
        this.lineType = lineType;
    }
    public Phone(){

    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean isValid() {
        return this.valid;
    }

    public Boolean getValid() {
        return this.valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getLocalFormat() {
        return this.localFormat;
    }

    public void setLocalFormat(String localFormat) {
        this.localFormat = localFormat;
    }

    public String getIntlFormat() {
        return this.intlFormat;
    }

    public void setIntlFormat(String intlFormat) {
        this.intlFormat = intlFormat;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public LineType getLineType() {
        return this.lineType;
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }



    
}
