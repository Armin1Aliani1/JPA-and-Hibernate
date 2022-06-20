package com.jpaAndHibernateTutorial.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Tag.TABLE_NAME)
public class Tag {

    public static final String TABLE_NAME = "tag";
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Tag() {
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

}
