package com.tieto.energy.poc.model;

import java.util.Date;

/**
 * @author Kamil Sasyn (sasynkam)
 *         2015-06-15
 */
public class Customer {

    private Long id;
    private String firstName;
    private String surname;
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
