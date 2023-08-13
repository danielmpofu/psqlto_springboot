package com.pgtosqlapp.demo.entities;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class IdDocument
{private int idType;
private String name;
private String description;
private String validity;
private boolean deleted;
}