package com.pgtosqlapp.demo.models;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class Address
{private String id;
private String country;
private String name;
private String city;
private String street;
private String ownerId;
private String proofOfResidency;
private boolean deleted;
}