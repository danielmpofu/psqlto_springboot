package com.pgtosqlapp.demo.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class IdDocument
{private int idType;

public void setIdType( int  idType ){
this.idType = idType;
}

public int  getIdType(){
return idType;
}
private String name;

public void setName( String  name ){
this.name = name;
}

public String  getName(){
return name;
}
private String description;

public void setDescription( String  description ){
this.description = description;
}

public String  getDescription(){
return description;
}
private String validity;

public void setValidity( String  validity ){
this.validity = validity;
}

public String  getValidity(){
return validity;
}
private boolean deleted;

public void setDeleted( boolean  deleted ){
this.deleted = deleted;
}

public boolean  getDeleted(){
return deleted;
}
}