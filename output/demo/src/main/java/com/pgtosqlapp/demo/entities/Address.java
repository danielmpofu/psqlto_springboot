package com.pgtosqlapp.demo.entities;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class Address
{ 
@Id 
@GeneratedValue  
@Column(name = "id", nullable = false) 
private String id;
private String country;
private String name;
private String city;
private String street;
private String ownerId;
private String proofOfResidency;
private boolean deleted;
}