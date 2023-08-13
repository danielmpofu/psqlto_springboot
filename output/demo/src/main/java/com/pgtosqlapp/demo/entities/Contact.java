package com.pgtosqlapp.demo.entities;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class Contact
{ 
@Id 
@GeneratedValue  
@Column(name = "id", nullable = false) 
private String id;
private boolean isPrimary;
}