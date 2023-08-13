package com.pgtosqlapp.demo.models;


import lombok.Data;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class PeopleRelationship
{private String id;
private String relationship;
private String ownerId;
private String otherPerson;
private boolean deleted;
}