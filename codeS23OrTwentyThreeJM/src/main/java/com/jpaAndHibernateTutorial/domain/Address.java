package com.jpaAndHibernateTutorial.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
    public static final String TABLE_NAME = "address";
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String address;

    public Address() {
    }

    // Many Address To One City
    /*@ManyToOne
    private City city;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }*/
}
