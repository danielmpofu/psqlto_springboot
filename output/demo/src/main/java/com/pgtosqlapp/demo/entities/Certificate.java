package com.pgtosqlapp.demo.entities;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class Certificate
{ 
@Id 
@GeneratedValue  
@Column(name = "id", nullable = false) 
private String id;
private String name;
private String type;
private String institution;
private String dateAwarded;
private String expiry;
private String ownerId;
private String certificateFile;
private boolean verified;
}