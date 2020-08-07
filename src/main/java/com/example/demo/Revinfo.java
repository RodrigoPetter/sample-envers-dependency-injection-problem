package com.example.demo;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@RevisionEntity(RevisionEntityListener.class)
public class Revinfo extends DefaultRevisionEntity {
}
