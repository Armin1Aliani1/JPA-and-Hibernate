package com.jpaAndHibernateTutorial.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = City.TABLE_NAME)
public class City {
    public static final String TABLE_NAME = "city";
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // To establish a two-way relationship between two entities, we use (@OneToMany Or ...) annotation for each of them.
    @OneToMany(mappedBy = "city")
    private List<Address> addressList;

    // Use annotation (@JoinColumn) for add city_id to addressList
    // In this case, there is no need to define the relationship between the address entity and the city entity
    /*@OneToMany
    @JoinColumn(name = "city_id")
    private List<Address> addressList;*/

    // To create an interface table between two entities, we use the following method in only one entity
    /*@OneToMany
    private List<Address> addressList;*/

    public City() {
    }

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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
