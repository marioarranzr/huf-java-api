package com.enxendra.huf.api.model.shared;

public class Party {

    private Long id;
    private String tax_number;
    private String name;
    private String first_surname;
    private String second_surname;
    private String address;
    private String poblation;
    private String province;
    private String post_code;
    private String country_code;
    private String phone;
    private String email;

    public String getTaxNumber() {
        return tax_number;
    }

    public void setTaxNumber(String tax_number) {
        this.tax_number = tax_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return first_surname;
    }

    public void setFirstSurname(String first_surname) {
        this.first_surname = first_surname;
    }

    public String getSecondSurname() {
        return second_surname;
    }

    public void setSecondSurname(String second_surname) {
        this.second_surname = second_surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPoblation() {
        return poblation;
    }

    public void setPoblation(String poblation) {
        this.poblation = poblation;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPostCode(String post_code) {
        this.post_code = post_code;
    }

    public String getCountryCode() {
        return country_code;
    }

    public void setCountryCode(String country_code) {
        this.country_code = country_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
