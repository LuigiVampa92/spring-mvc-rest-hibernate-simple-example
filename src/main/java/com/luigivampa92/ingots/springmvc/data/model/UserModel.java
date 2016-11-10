package com.luigivampa92.ingots.springmvc.data.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "TEST_USER")
@SequenceGenerator(name = "TEST_USER_SEQ", sequenceName = "TEST_USER_SEQ")
public class UserModel {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "TEST_USER_SEQ")
    private BigInteger id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    public BigInteger getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

