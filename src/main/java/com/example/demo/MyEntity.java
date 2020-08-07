package com.example.demo;

import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Audited
public class MyEntity {

    @Id
    private long id;

    @Column
    private String value;
}
