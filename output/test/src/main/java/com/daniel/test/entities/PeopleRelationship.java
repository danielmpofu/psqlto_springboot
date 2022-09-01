package com.daniel.test.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class PeopleRelationship
{private @Id @GeneratedValue @Column(name = "id", nullable = false)String id;

public void setId( String id ){
this.id = id;
}

public String getId(){
return id;
}
private String relationship;

public void setRelationship( String relationship ){
this.relationship = relationship;
}

public String getRelationship(){
return relationship;
}
private String ownerId;

public void setOwnerId( String ownerId ){
this.ownerId = ownerId;
}

public String getOwnerId(){
return ownerId;
}
private String otherPerson;

public void setOtherPerson( String otherPerson ){
this.otherPerson = otherPerson;
}

public String getOtherPerson(){
return otherPerson;
}
private boolean deleted;

public void setDeleted( boolean deleted ){
this.deleted = deleted;
}

public boolean getDeleted(){
return deleted;
}
}