package com.daniel.test.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Contact
{private @Id @GeneratedValue @Column(name = "id", nullable = false)String id;

public void setId( String id ){
this.id = id;
}

public String getId(){
return id;
}
private boolean isPrimary;

public void setIsPrimary( boolean isPrimary ){
this.isPrimary = isPrimary;
}

public boolean getIsPrimary(){
return isPrimary;
}
}