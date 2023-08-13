package com.pgtosqlapp.demo.models;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class Institution
{private String id;
private String name;
private String description;
private String logo;
private String address;
private String type;
private String contact;
private boolean deleted;
}