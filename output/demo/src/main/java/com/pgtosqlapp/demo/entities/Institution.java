package com.pgtosqlapp.demo.entities;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class Institution
{ 
@Id 
@GeneratedValue  
@Column(name = "id", nullable = false) 
private String id;
private String name;
private String description;
private String logo;
private String address;
private String type;
private String contact;
private boolean deleted;
}