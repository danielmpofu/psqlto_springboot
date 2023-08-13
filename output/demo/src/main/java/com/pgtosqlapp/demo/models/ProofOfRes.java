package com.pgtosqlapp.demo.models;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class ProofOfRes
{private String id;
private String address;
private String ownerId;
private String document;
private String name;
private String description;
private String type;
private boolean deleted;
}