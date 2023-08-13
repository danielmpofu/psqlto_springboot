package com.pgtosqlapp.demo.entities;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class PeopleRelationship
{ 
@Id 
@GeneratedValue  
@Column(name = "id", nullable = false) 
private String id;
private String relationship;
private String ownerId;
private String otherPerson;
private boolean deleted;
}