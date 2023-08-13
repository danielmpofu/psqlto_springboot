package com.pgtosqlapp.demo.entities;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class ProofOfRes
{ 
@Id 
@GeneratedValue  
@Column(name = "id", nullable = false) 
private String id;
private String address;
private String ownerId;
private String document;
private String name;
private String description;
private String type;
private boolean deleted;
}