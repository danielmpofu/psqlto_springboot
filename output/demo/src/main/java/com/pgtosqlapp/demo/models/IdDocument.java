package com.pgtosqlapp.demo.models;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class IdDocument
{private int idType;
private String name;
private String description;
private String validity;
private boolean deleted;
}